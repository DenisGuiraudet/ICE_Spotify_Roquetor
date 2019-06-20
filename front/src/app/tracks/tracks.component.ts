import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-tracks',
  templateUrl: './tracks.component.html',
  styleUrls: ['./tracks.component.scss']
})
export class TracksComponent implements OnInit {
  
  data = {
    tracks: [
      {
        album: {
          id: 'id',
          image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
          name: 'name'
        },
        duration_ms: 0,
        id: 'id',
        name: 'name',
        popularity: 0
      }
    ]
  }

  constructor(private storeService: StoreService) {
    if (!this.storeService.spotifyUserToken) {
      console.log('Spotify not init');
    }
  }

  ngOnInit() {
  }

}
