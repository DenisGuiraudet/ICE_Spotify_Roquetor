import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {FormBuilder} from '@angular/forms';
import {MatSnackBar} from '@angular/material/snack-bar';
import { StoreService } from '../store.service';
import { SearchbarComponent } from '../ui/searchbar/searchbar.component';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.component.html',
  styleUrls: ['./albums.component.scss']
})
export class AlbumsComponent implements OnInit {
  private searchbar: SearchbarComponent;

  data = {
    albums: [
      {
        id: 'id',
        image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
        name: 'name',
        popularity: 0,
        release_date: 'release_date',
        tracks_total: 'total'
      },
      {
        id: '12',
        image: 'https://assets.afcdn.com/story/20180420/1155990_w767h767c1cx1879cy955.jpg',
        name: 'Second album',
        popularity: 12,
        release_date: '09/17/2010',
        tracks_total: '12'
      }
    ]
  }

  constructor(
    private fb: FormBuilder,
    private _snackBar: MatSnackBar,
    private storeService: StoreService,
    private router: Router
  ) {
    this.searchbar = new SearchbarComponent(fb, _snackBar, storeService, router);
    if (!this.storeService.spotifyUserToken) {
      console.log('Spotify not init');
    }
  }

  ngOnInit() {
  }

  private search(name) {
    this.searchbar.search("search album " + name);
  }

}
