# ICE_Spotify_Roquetor
We send rocket

## Team
Denis Guiraudet, Matthieu Orriere, Arnaud Sibade, Alexandre Pausé, Guilhem Susa, Titouan Bouete-Giraud

### Dev Environment
- Docker

## How to run

**Download [Node](https://nodejs.org/en/)**  
Execute `npm install`

**Download [Docker](https://www.docker.com/get-started)**  
To build docker execute `docker build -t spotifyrequetor .`  
Then run `docker run -p 80:80 --name spotifyrequetor-container -d spotifyrequetor`

Go to `http://localhost:80/`

To stop execute `docker stop spotifyrequetor-container`, then execute `docker rm spotifyrequetor-container`.

## How to use


The Spotify-Requetor application is an application that allows you to search for artists, albums, titles and playlists in a very simple way.
After doing a search, you can observe statistics on albums and titles.

### I. The Home page :


The home page is divide in 3 parts :
- The generation token
- The searchbar
- The specific reseach part (by artist, album, tracks, playlist)

### II. Generation of the token

First of all, you will need to generate a token on Spotify. To do that, click on the button "Récuperer un token".
You will find a second button named "Get Token", click on it and select "Request token". 
Agree with terms & conditions of Spotify and you will find the field OAuth Token filled in.
Copy the token and past it in the field next to the button "Récuperer un token" on the home page of the Spotify-Requetor application.

### III. Do a search with the searchbar

You can select 2 options for a search.
- If you choose "Show", you will search a single artist / album / track / playlist who matches with the words
- Otherwise, if you choose "Search", you will search multiple artist / album / track / playlist who matches with the words

### IV. Select a specific search

You can choose between the four type of search
 - Artist
 - Album
 - Track
 - Playlist

In each type of search, you can choose to search, like the searchbar, one or many artist / album / track / playlist.

### V. The Artist pages

#### 1. One artist 


In this page, you will find the information of an artist you searched before.
You will find :
- The name of the artist
- Its popularity
- The numbers of followers

You can do an another research with the search on the top.


#### 2. Multiple artists


In this page, you will find a list of artist who matches with the research you did before.
You will find :
- The picture of the artist
- Its name
- Its popularity
- The numbers of followers

You can do an another research with the search on the top.

### VI. The Albums pages

#### 1. One album
In this page, you will find the information of an album you searched before.
You will find :
- The name of the album
- Its popularity
- The release date
- The list of tracks of the album

You can do an another research with the search on the top.

#### 2. Multiple albums

In this page, you will find a list of albums who matches with the research you did before.
You will find :
- The picture of the album
- Its name
- Its popularity
- Its total tracks
- The release date

You can do an another research with the search on the top.

### VII. The Tracks pages

#### 1. One track

In this page, you will find the information of a track you searched before.
You will find :
- The name of the album
- Its popularity
- The release date
- Its duration (in ms)

You can do an another research with the search on the top.

#### 2. Multiple tracks

In this page, you will find a list of tracks who matches with the research you did before.
You will find :
- The picture of the album who contain the track
- Its name
- The release date

You can do an another research with the search on the top.

### VIII. The Playlists pages

#### 1. One playlist

In this page, you will find the information of an playlist you searched before.
You will find :
- The name of the playlist
- Its popularity
- The description
- The list of tracks of the playlist

You can do an another research with the search on the top.

#### 2. Multiple playlists

In this page, you will find a list of playlist who matches with the research you did before.
You will find :
- The picture of the playlist
- Its name
- Its description
- The number of followers

You can do an another research with the search on the top.
