import { Component, OnInit } from '@angular/core';

import { StoreService } from '../store.service';

@Component({
  selector: 'app-album',
  templateUrl: './album.component.html',
  styleUrls: ['./album.component.scss']
})
export class AlbumComponent implements OnInit {
  
  data = {
    artists: [
      {
        id: 'id',
        name: 'name'
      }
    ],
    id: 'id',
    images: [
      {
        url: 'url'
      }
    ],
    name: 'name',
    popularity: 0,
    release_date: 'release_date',
    release_date_precision: 'release_date_precision',
    tracks: {
      items: [
        {
          duration_ms: 0,
          id: 'id',
          name: 'name',
          track_number: 0
        }
      ]
    }
  }

  constructor(private storeService: StoreService) {
    if (!this.storeService.spotifyUserToken) {
      console.log('Spotify not init');
    }
  }

  ngOnInit() {
  }

}
