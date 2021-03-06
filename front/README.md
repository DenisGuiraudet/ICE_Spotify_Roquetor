# Iceroquetor

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.3.3.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

## Wanted data structure
[Spotify API](https://developer.spotify.com/documentation/web-api/reference/)

### ALBUM
```javascript
ALBUM LIST:

// https://developer.spotify.com/documentation/web-api/reference/albums/get-several-albums/
{
  albums: [
    {
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
      popularity: 0,
      release_date: 'release_date',
      release_date_precision: 'release_date_precision',
      tracks: {
        total: 'total'
      }
    }
  ]
}

ALBUM:

// https://developer.spotify.com/documentation/web-api/reference/albums/get-album/
{
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
  popularity: 0,
  release_date: 'release_date',
  release_date_precision: 'release_date_precision',
  tracks: {
    items: [
    	{
      	duration_ms: 0,
        id: 'id',
        name: 'name',
        track_number: 0
      }
    ]
  }
}
```

### ARTIST
```javascript
ARTIST LIST:

// https://developer.spotify.com/documentation/web-api/reference/artists/get-several-artists/
{
  artists: [
    {
      followers: 0,
      genres: [
        'genres'
      ],
      id: 'id',
      images: [
        {
          url: 'url'
        }
      ],
      name: 'name',
      popularity: 'popularity'
    }
  ]
}

ARTIST:

// https://developer.spotify.com/documentation/web-api/reference/artists/get-artist/
{
  followers: 0,
  genres: [
    'genres'
  ],
  id: 'id',
  images: [
    {
      url: 'url'
    }
  ],
  name: 'name',
  popularity: 'popularity'
}

// https://developer.spotify.com/documentation/web-api/reference/artists/get-artists-albums/
{
	items: [
  	{
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
    }
  ]
}
```

### TRACK
```javascript
TRACK LIST:

// https://developer.spotify.com/documentation/web-api/reference/tracks/get-several-tracks/
{
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

TRACK:

// https://developer.spotify.com/documentation/web-api/reference/tracks/get-track/
{
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
  popularity: 0
}

// https://developer.spotify.com/documentation/web-api/reference/tracks/get-audio-features/
{
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
```

### PLAYLIST
```javascript
PLAYLIST LIST:

// https://developer.spotify.com/documentation/web-api/reference/playlists/get-playlist/
// { playlists: [ for each ] }
{
    description: 'description',
    followers: {
        total: 0
    },
    id: 'id',
    images: [
        {
            url: 'url'
        }
    ],
    name: 'name',
    total: 0
}

PLAYLIST:

// https://developer.spotify.com/documentation/web-api/reference/playlists/get-playlist/
{
    description: 'description',
    followers: {
        total: 0
    },
    id: 'id',
    images: [
        {
            url: 'url'
        }
    ],
    name: 'name',
    tracks: {
        items: [
            {
                track: {
                    album: {
                      id: 'id',
                      images: [
                          {
                              url: 'url'
                          }
                      ],
                      name: 'name'
                    },
                    artists: [
                        {
                            id: 'id',
                            name: 'name'
                        }
                    ],
                    duration_ms: 0,
                    id: 'id',
                    name: 'name',
                    popularity: 0
                }
            }
        ]
    }
}
```
