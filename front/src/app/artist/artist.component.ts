import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-artist',
  templateUrl: './artist.component.html',
  styleUrls: ['./artist.component.scss']
})
export class ArtistComponent implements OnInit {
  
  data = this.storeService.data;
  /*data = {
    followers: 0,
    id: 'id',
    image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
    name: 'name',
    popularity: 'popularity'
  }*/

  constructor() { }

  ngOnInit() {
  }

}
