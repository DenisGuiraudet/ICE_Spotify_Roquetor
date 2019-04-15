import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-playlist',
  templateUrl: './playlist.component.html',
  styleUrls: ['./playlist.component.scss']
})
export class PlaylistComponent implements OnInit {
  
  data = {
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
    tracks: {
        items: [
            {
                track: {
                    album: {
                      id: 'id',
                      images: [
                          {
                              url: 'url'
                          }
                      ],
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
            }
        ]
    }
  }

  constructor() { }

  ngOnInit() {
  }

}
