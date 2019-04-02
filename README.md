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
