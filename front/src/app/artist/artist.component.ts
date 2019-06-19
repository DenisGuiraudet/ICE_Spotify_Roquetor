import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-artist',
  templateUrl: './artist.component.html',
  styleUrls: ['./artist.component.scss']
})
export class ArtistComponent implements OnInit {
  
  data = this.storeService.data;
  /*data = {
    followers: 0,
    id: 'id',
    image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
    name: 'name',
    popularity: 'popularity'
  }*/

  constructor(private storeService: StoreService) {
    if (!this.storeService.spotifyUserToken) {
      console.log('Spotify not init');
    }
  }

  ngOnInit() {
  }

}
