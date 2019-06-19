
// ALBUM

const parseAlbum = function (datas) {
  let newData = datas[0].$;

  newData.tracks = [];
  for (let i = 1; i < datas.length; i++) {
    newData.tracks.push(datas[i].$);
  }

  return newData;
};

const parseAlbums = function (datas) {
  let newData = {
    albums: []
  };

  for (let i = 0; i < datas.length; i++) {
    newData.albums.push(datas[i].$);
  }

  return newData;
};

// ARTIST

const parseArtist = function (datas) {
  return datas[0].$;
};

const parseArtists = function (datas) {
  let newData = {
    artists: []
  };

  for (let i = 0; i < datas.length; i++) {
    newData.artists.push(datas[i].$);
  }

  return newData;
};

// PLAYLIST

const parsePlaylist = function (datas) {
  let newData = datas[0].$;

  newData.tracks = [];
  for (let i = 1; i < datas.length; i++) {
    newData.tracks.push(datas[i].$);
  }

  return newData;
};

const parsePlaylists = function (datas) {
  let newData = {
    playlists: []
  };

  for (let i = 0; i < datas.length; i++) {
    newData.playlists.push(datas[i].$);
  }

  return newData;
};

// TRACK

const parseTrack = function (datas) {
  return datas[0].$;
};

const parseTracks = function (datas) {
  let newData = {
    tracks: []
  };

  for (let i = 0; i < datas.length; i++) {
    newData.tracks.push(datas[i].$);
  }

  return newData;
};

export default {
    parseAlbum,
    parseAlbums,
    parseArtist,
    parseArtists,
    parsePlaylist,
    parsePlaylists,
    parseTrack,
    parseTracks
};
