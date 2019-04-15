import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.component.html',
  styleUrls: ['./albums.component.scss']
})
export class AlbumsComponent implements OnInit {

  data = {
    albums: [
      {
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
          total: 'total'
        }
      }
    ]
  }

  constructor() { }

  ngOnInit() {
  }

}
