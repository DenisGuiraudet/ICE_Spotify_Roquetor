import { Component } from '@angular/core';
import { StoreService } from './store.service';
import { parseString } from 'xml2js';



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
      console.log(result);
  });
  }
}

