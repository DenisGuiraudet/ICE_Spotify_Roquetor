import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AlbumComponent } from './album/album.component';
import { AlbumsComponent } from './albums/albums.component';
import { ArtistComponent } from './artist/artist.component';
import { ArtistsComponent } from './artists/artists.component';
import { PlaylistComponent } from './playlist/playlist.component';
import { PlaylistsComponent } from './playlists/playlists.component';
import { TrackComponent } from './track/track.component';
import { TracksComponent } from './tracks/tracks.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'album',
    component: AlbumComponent
  },
  {
    path: 'albums',
    component: AlbumsComponent
  },
  {
    path: 'artist',
    component: ArtistComponent
  },
  {
    path: 'artists',
    component: ArtistsComponent
  },
  {
    path: 'playlist',
    component: PlaylistComponent
  },
  {
    path: 'playlists',
    component: PlaylistsComponent
  },
  {
    path: 'track',
    component: TrackComponent
  },
  {
    path: 'tracks',
    component: TracksComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
