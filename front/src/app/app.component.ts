import { Component } from '@angular/core';
import { StoreService } from './store.service';
import axios from 'axios';
import { parseString } from 'xml2js';
import { TYPES, SPOTIFY_TYPES } from './constants';
import helpers from './helpers';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {

  constructor(private storeService: StoreService) {
    // Spotify TOKEN
    if (!this.storeService.spotifyUserToken) {
      console.log('Spotify not init');
    }
    
    // Back Call
    axios.get('http://localhost:3232', {
      params: {
        token: this.storeService.spotifyUserToken,
        value: "Michel le bresil",
        type: TYPES.ARTIST
      }
    }).then(response => {
      this.readXml();
    }).catch(error => {
      console.log(error);
    }).then(() => {
      this.readXml(); // TODO: remove from here once it works
    });
  }

  readXml() {
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", "../assets/teste.xmi", false);
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
          this.storeService.data = helpers.parseAlbum(datas);
        } else {
          this.storeService.data = helpers.parseAlbums(datas);
        }
        break;
      case SPOTIFY_TYPES.ARTIST:
          if (datas.length === 1) {
            this.storeService.data = helpers.parseArtist(datas);
          } else {
            this.storeService.data = helpers.parseArtists(datas);
          }
        break;
      case SPOTIFY_TYPES.PLAYLIST:
          if (typeof mainData.track !== 'undefined') {
            this.storeService.data = helpers.parsePlaylist(datas);
          } else {
            this.storeService.data = helpers.parsePlaylists(datas);
          }
        break;
      case SPOTIFY_TYPES.TRACK:
          if (datas.length === 1) {
            this.storeService.data = helpers.parseTrack(datas);
          } else {
            this.storeService.data = helpers.parseTracks(datas);
          }
        break;
      default:
        console.warn('Type unknown', mainDataType);
    }
  }
}

