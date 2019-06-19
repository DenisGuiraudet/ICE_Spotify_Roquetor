import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-playlists',
  templateUrl: './playlists.component.html',
  styleUrls: ['./playlists.component.scss']
})
export class PlaylistsComponent implements OnInit {
  
  data = this.storeService.data;
  /*data = {
    playlists: [
      {
        description: 'description',
        followers: 0,
        id: 'id',
        image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
        name: 'name',
        total: 0
      }
    ]
  }*/

  constructor(private storeService: StoreService) {
    if (!this.storeService.spotifyUserToken) {
      console.log('Spotify not init');
    }
  }

  ngOnInit() {
  }

}
