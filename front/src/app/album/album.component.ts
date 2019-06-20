import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-album',
  templateUrl: './album.component.html',
  styleUrls: ['./album.component.scss']
})
export class AlbumComponent implements OnInit {

  data = {
    id: 'id',
    image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
    name: 'name',
    popularity: 0,
    release_date: 'release_date',
    release_date_precision: 'release_date_precision',
    tracks: [
      {
        duration_ms: 0,
        id: 'id',
        name: 'name',
        track_number: 1,
        danceability: 0.735
      },
      {
        duration_ms: 12,
        id: '1212',
        name: 'Une chanson',
        track_number: 2,
        danceability: 0.1
      },
      {
        duration_ms: 122,
        id: '444',
        name: 'Toto',
        track_number: 3,
        danceability: 0.99
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
