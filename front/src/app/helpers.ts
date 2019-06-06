
// ALBUM

const parseAlbum = function (datas) {
  let newData = datas[0].$;

  let tracks = [];
  for (let i = 1; i < datas.length; i++) {
    tracks.push(datas[i].$);
  }
  newData['tracks'] = {
    items: tracks
  };

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
  // TODO
  return newData;
};

// PLAYLIST

const parsePlaylist = function (datas) {
  return datas;
};

const parsePlaylists = function (datas) {
  return datas;
};

// TRACK

const parseTrack = function (datas) {
  return datas;
};

const parseTracks = function (datas) {
  return datas;
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
