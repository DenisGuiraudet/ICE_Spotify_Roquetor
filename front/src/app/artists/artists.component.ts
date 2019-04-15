import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.scss']
})
export class ArtistsComponent implements OnInit {
  
  data = {
    artists: [
      {
        followers: 0,
        genres: [
          'genres'
        ],
        id: 'id',
        images: [
          {
            url: 'url'
          }
        ],
        name: 'name',
        popularity: 'popularity'
      }
    ]
  }

  constructor() { }

  ngOnInit() {
  }

}
