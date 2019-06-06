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
        token: "token",
        value: "Michel le bresil",
        type: TYPES.ARTIST
      }
    }).then(function (response) {
      console.log("then", response);
    }).catch(function (error) {
      console.log("catch", error);
    }).then(function () {
      // always executed
    }); 

    // Back Response
    let xml = "";
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", "../assets/teste.xmi", false);
    rawFile.onreadystatechange = function () {
        if(rawFile.readyState === 4){
            if(rawFile.status === 200 || rawFile.status == 0){
                xml = rawFile.responseText;
                console.log(xml);
            }
        }
    }
    rawFile.send(null);
    parseString(xml, (err, result) => {
      this.parsexml(result);
    });
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
        break;
      case SPOTIFY_TYPES.PLAYLIST:
        break;
      case SPOTIFY_TYPES.TRACK:
        break;
      default:
        console.warn('Type unknown', mainDataType);
    }
  }
}

