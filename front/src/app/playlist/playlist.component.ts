import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-playlist',
  templateUrl: './playlist.component.html',
  styleUrls: ['./playlist.component.scss']
})
export class PlaylistComponent implements OnInit {
  
  data = {
    description: 'description',
    followers: 0,
    id: 'id',
    image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
    name: 'name',
    tracks: [
        {
            album: {
                id: 'id',
                image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
                name: 'name'
            },
            artists: [
                {
                    id: 'id',
                    name: 'name'
                }
            ],
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
