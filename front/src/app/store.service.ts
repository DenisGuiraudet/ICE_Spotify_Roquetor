import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  constructor() { }

  spotifyUserToken: string = null;
  data: object = null;

}
