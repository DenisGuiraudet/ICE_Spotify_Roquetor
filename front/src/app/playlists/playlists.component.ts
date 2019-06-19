import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-playlists',
  templateUrl: './playlists.component.html',
  styleUrls: ['./playlists.component.scss']
})
export class PlaylistsComponent implements OnInit {
  
  data = {
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
  }

  constructor() { }

  ngOnInit() {
  }

}
