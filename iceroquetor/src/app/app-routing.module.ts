import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ArtistComponent } from './artist/artist.component';

const routes: Routes = [
  { path: '',
    redirectTo: '/artist',
    pathMatch: 'full'
  },
  {
    path: 'artist',
    component: ArtistComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
