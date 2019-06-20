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
    image: 'https://i.scdn.co/image/3d99e3949772e8cc079023c52d027c6a2cbfb14b',
    name: 'Platinium',
    popularity: 12402,
    release_date: '10/12/12',
    release_date_precision: 'release_date_precision',
    tracks: [
      {
        duration_ms: 0,
        id: 'id',
        name: 'Say hi',
        track_number: 1,
        danceability: 0.735
      },
      {
        duration_ms: 12,
        id: '1212',
        name: 'Platinium',
        track_number: 2,
        danceability: 0.11
      },
      {
        duration_ms: 122,
        id: '444',
        name: 'Hello darkness',
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
