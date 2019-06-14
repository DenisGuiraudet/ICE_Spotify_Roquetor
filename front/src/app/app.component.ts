import { Component } from '@angular/core';
import { StoreService } from './store.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {

  constructor(
    private router: Router,
    private storeService: StoreService
  ) {}

  get currentRoute() {
    return this.router.url.substr(1);
  }

}

