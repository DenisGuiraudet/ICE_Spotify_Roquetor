import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-artist',
  templateUrl: './artist.component.html',
  styleUrls: ['./artist.component.scss']
})
export class ArtistComponent implements OnInit {
  
  data = {
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

  constructor() { }

  ngOnInit() {
  }

}
