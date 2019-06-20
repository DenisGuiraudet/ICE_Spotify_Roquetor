import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-track',
  templateUrl: './track.component.html',
  styleUrls: ['./track.component.scss']
})
export class TrackComponent implements OnInit {
  
  data = this.storeService.data;
  /*data = {
    album: {
      id: 'id',
      image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
      name: 'name',
      release_date: 'release_date',
      release_date_precision: 'release_date_precision'
    },
    duration_ms: 0,
    id: 'id',
    name: 'name',
    popularity: 0,
    
    acousticness: 0,
    danceability: 0,
    energy: 0,
    instrumentalness: 0,
    liveness: 0,
    loudness: 0,
    speechiness: 0,
    valence: 0,
    tempo: 0
  }*/

  constructor(private storeService: StoreService) {
    if (!this.storeService.spotifyUserToken) {
      console.log('Spotify not init');
    }
  }

  ngOnInit() {
  }

}
