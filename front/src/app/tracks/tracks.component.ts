import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tracks',
  templateUrl: './tracks.component.html',
  styleUrls: ['./tracks.component.scss']
})
export class TracksComponent implements OnInit {
  
  data = {
    tracks: [
      {
        album: {
          id: 'id',
          images: [
            {
              url: 'url'
            }
          ],
          name: 'name'
        },
        duration_ms: 0,
        id: 'id',
        name: 'name',
        popularity: 0
      }
    ]
  }

  constructor() { }

  ngOnInit() {
  }

}
