import { Component, OnInit } from '@angular/core';

import { StoreService } from '../store.service';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.component.html',
  styleUrls: ['./albums.component.scss']
})
export class AlbumsComponent implements OnInit {

  data = {
    albums: [
      {
        id: 'id',
        image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
        name: 'name',
        popularity: 0,
        release_date: 'release_date',
        tracks_total: 'total'
      },
      {
        id: '12',
        image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
        name: 'Second album',
        popularity: 12,
        release_date: '09/17/2010',
        tracks_total: '12'
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
