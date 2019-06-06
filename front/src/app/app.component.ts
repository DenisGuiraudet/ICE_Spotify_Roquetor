import { Component } from '@angular/core';
import { StoreService } from './store.service';
import { parseString } from 'xml2js';
import { SPOTIFY_TYPES } from './constants';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {

  constructor(private storeService: StoreService) {
    if (!this.storeService.spotifyUserToken) {
      console.log('Spotify not init');
    }
    let xml = '<?xml version="1.0" encoding="ASCII"?><spotify_Requetor:CommandManager xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:spotify_Requetor="http://www.example.org/spotify_Requetor"><request xsi:type="spotify_Requetor:Artist" name="David Guetta" track="//@request.1 //@request.2 //@request.3"/><request xsi:type="spotify_Requetor:Track" name="Titanium"/><request xsi:type="spotify_Requetor:Track" name="Titanium2"/><request xsi:type="spotify_Requetor:Track" name="Titanium3"/></spotify_Requetor:CommandManager>';
    parseString(xml, (err, result) => {
      let datas = result['spotify_Requetor:CommandManager'].request;
      let mainType = datas[0].$['xsi:type'];

      console.log(datas);
      for (let dataKey in datas) {
        let data = datas[dataKey];

        switch (data.$['xsi:type']) {
          case SPOTIFY_TYPES.ALBUM:
            break;
          case SPOTIFY_TYPES.ARTIST:
            break;
          case SPOTIFY_TYPES.PLAYLIST:
            break;
          case SPOTIFY_TYPES.TRACK:
            break;
          default:
            console.warn('Type unknown', datas[0].$['xsi:type']);
        }
      }
    });
  }
}

