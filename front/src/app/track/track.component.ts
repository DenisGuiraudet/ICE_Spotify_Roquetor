import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-track',
  templateUrl: './track.component.html',
  styleUrls: ['./track.component.scss']
})
export class TrackComponent implements OnInit {
  
  data = {
    album: {
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
      release_date: 'release_date',
      release_date_precision: 'release_date_precision'
    },
    duration_ms: 0,
    id: 'id',
    name: 'name',
    popularity: 0,
    
    acousticness: 0,
    danceability: 0,
    energy: 0,
    instrumentalness: 0,
    liveness: 0,
    loudness: 0,
    speechiness: 0,
    valence: 0,
    tempo: 0
  }

  constructor() { }

  ngOnInit() {
  }

}
