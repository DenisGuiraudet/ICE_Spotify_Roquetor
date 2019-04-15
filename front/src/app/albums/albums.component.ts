import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.component.html',
  styleUrls: ['./albums.component.scss']
})
export class AlbumsComponent implements OnInit {

  data: {
    albums: [
      {
        artists: [
          {
            id: '',
            name: ''
          }
        ],
        id: '',
        images: [
          {
            url: ''
          }
        ],
        name: '',
        popularity: 0,
        release_date: '',
        release_date_precision: '',
        tracks: {
          total: ''
        }
      }
    ]
  } 

  constructor() { }

  ngOnInit() {
  }

}
