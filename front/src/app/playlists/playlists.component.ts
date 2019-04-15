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
        followers: {
            total: 0
        },
        id: 'id',
        images: [
            {
                url: 'url'
            }
        ],
        name: 'name',
        total: 0
      }
    ]
  }

  constructor() { }

  ngOnInit() {
  }

}
