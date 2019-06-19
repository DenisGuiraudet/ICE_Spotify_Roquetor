import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.scss']
})
export class ArtistsComponent implements OnInit {
  
  data = this.storeService.data;
  /*data = {
    artists: [
      {
        followers: 0,
        id: 'id',
        image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
        name: 'name',
        popularity: 'popularity'
      }
    ]
  }*/

  constructor() { }

  ngOnInit() {
  }

}
