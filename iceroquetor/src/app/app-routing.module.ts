import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ArtistComponent } from './artist/artist.component';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';

const routes: Routes = [
  { path: '',
    redirectTo: '/artist',
    pathMatch: 'full'
  },
  {
    path: 'artist',
    component: ArtistComponent
  },
  {path: 'api/employees', component: EmployeeListComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
