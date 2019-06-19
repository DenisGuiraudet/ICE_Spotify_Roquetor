import {Component, OnInit, Input} from '@angular/core';
import {Router} from "@angular/router";
import {FormBuilder, FormGroup} from '@angular/forms';
import {MatSnackBar} from '@angular/material/snack-bar';
import {Observable} from 'rxjs';
import {map, startWith} from 'rxjs/operators';
import { StoreService } from '../../store.service';
import axios from 'axios';
import { parseString } from 'xml2js';
import { TYPES, SPOTIFY_TYPES } from '../../constants';
import helperParser from '../../helpers/parser';

export interface StateGroup {
  letter: string;
  names: string[];
}

export const _filter = (opt: string[], value: string): string[] => {
  const filterValue = value.toLowerCase();

  return opt.filter(item => item.toLowerCase().indexOf(filterValue) === 0);
};

@Component({
  selector: 'app-searchbar',
  templateUrl: './searchbar.component.html',
  styleUrls: ['./searchbar.component.scss']
})
export class SearchbarComponent implements OnInit {
  @Input() initValue: String;
  
  stateForm: FormGroup = this.fb.group({
    stateGroup: '',
  });

  stateGroups: StateGroup[] = [{
    letter: 'show',
    names: ['show artist ', 'show album ', 'show track ', 'show playlist ']
  }, {
    letter: 'search',
    names: ['search artist ', 'search album ', 'search track ', 'search playlist ']
  }];

  stateGroupOptions: Observable<StateGroup[]>;

  constructor(
    private fb: FormBuilder,
    private _snackBar: MatSnackBar,
    private storeService: StoreService,
    private router: Router
  ) {}

  ngOnInit() {
    if (this.initValue) {
      this.stateForm.get('stateGroup').setValue(this.initValue);
    }

    // Show / Search placeholders
    this.stateGroupOptions = this.stateForm.get('stateGroup')!.valueChanges
      .pipe(
        startWith(''),
        map(value => this._filterGroup(value))
      );
  }

  private _filterGroup(value: string): StateGroup[] {
    if (value) {
      return this.stateGroups
        .map(group => ({letter: group.letter, names: _filter(group.names, value)}))
        .filter(group => group.names.length > 0);
    }

    return this.stateGroups;
  }

  private search() {
    if (!this.storeService.spotifyUserToken) {
      this.showSnackbar('No spotify token');
      return;
    }

    let params = this.cleaningRequest(this.stateForm.get('stateGroup').value);
    if (!params) {
      this.showSnackbar('Missing some words in the request');
      return;
    }
    
    // Back Call
    axios.get('http://127.0.0.1:9000/', {
      params
    }).then(response => {
      this.showSnackbar('response ' + response);
      this.readXml(this.storeService.spotifyUserToken);
    }).catch(error => {
      // if token error, for server we have workaround
      if (!this.storeService.spotifyUserToken) {
        this.showSnackbar('error ' + error);
      }
    }).finally(() => {
      this.readXml(this.storeService.spotifyUserToken); // TODO: remove from here once it works
    });
  }

  private cleaningRequest(request): object {
    let words = request.split(' ');
    if (words.length < 3) {
      return null;
    }

    let value = "";
    for(let i = 2; i < words.length; i++) {
      value += words[i];
      if(i != words.length-1)
      value += " ";
    }

    let params = {
      token: this.storeService.spotifyUserToken,
      value,
      type: words[1]
    };
    if(words[0] == 'show') {
      params['only'] = 'only';
    }

    return params;
  }

  readXml(token: String) {
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", "../../../../../dsl/Spotify_Requetor/" +token+ ".xmi", false);
    rawFile.onreadystatechange = () => {
        if(rawFile.readyState === 4){
            if(rawFile.status === 200 || rawFile.status == 0){
                parseString(rawFile.responseText, (err, result) => {
                  this.parsexml(result);
                });
            }
        }
    }
    rawFile.send(null);
  }

  parsexml(xml) {
    let datas = xml['spotify_Requetor:CommandManager'].request;
    let mainData = datas[0].$;
    let mainDataType = mainData['xsi:type'];

    switch (mainDataType) {
      case SPOTIFY_TYPES.ALBUM:
        if (typeof mainData.track !== 'undefined') {
          this.storeService.data = helperParser.parseAlbum(datas);
          this.router.navigate(['/album']);
        } else {
          this.storeService.data = helperParser.parseAlbums(datas);
          this.router.navigate(['/albums']);
        }
        break;
      case SPOTIFY_TYPES.ARTIST:
          if (datas.length === 1) {
            this.storeService.data = helperParser.parseArtist(datas);
            this.router.navigate(['/artist']);
          } else {
            this.storeService.data = helperParser.parseArtists(datas);
            this.router.navigate(['/artists']);
          }
        break;
      case SPOTIFY_TYPES.PLAYLIST:
          if (typeof mainData.track !== 'undefined') {
            this.storeService.data = helperParser.parsePlaylist(datas);
            this.router.navigate(['/playlist']);
          } else {
            this.storeService.data = helperParser.parsePlaylists(datas);
            this.router.navigate(['/playlists']);
          }
        break;
      case SPOTIFY_TYPES.TRACK:
          if (datas.length === 1) {
            this.storeService.data = helperParser.parseTrack(datas);
            this.router.navigate(['/track']);
          } else {
            this.storeService.data = helperParser.parseTracks(datas);
            this.router.navigate(['/tracks']);
          }
        break;
      default:
        this.showSnackbar('Type unknown ' + mainDataType);
    }
  }

  showSnackbar(message: string) {
    this._snackBar.open(
      message,
      '❌',
      {
        duration: 2000
      }
    );
  }

}
