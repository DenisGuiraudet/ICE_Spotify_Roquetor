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
    })
    .then(function (response) {
      console.log("then", response);
    })
    .catch(function (error) {
      console.log("catch", error);
    })
    .then(function () {
      // always executed
    }); 

    // Back Response
    let xml = '<?xml version="1.0" encoding="ASCII"?><spotify_Requetor:CommandManager xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:spotify_Requetor="http://www.example.org/spotify_Requetor"><request xsi:type="spotify_Requetor:Artist" name="David Guetta" track="//@request.1 //@request.2 //@request.3"/><request xsi:type="spotify_Requetor:Track" name="Titanium"/><request xsi:type="spotify_Requetor:Track" name="Titanium2"/><request xsi:type="spotify_Requetor:Track" name="Titanium3"/></spotify_Requetor:CommandManager>';
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

