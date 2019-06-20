package dsl;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import spotify_Requetor.Album;
import spotify_Requetor.Artist;
import spotify_Requetor.CommandManager;
import spotify_Requetor.Playlist;
import spotify_Requetor.Spotify_RequetorFactory;
import spotify_Requetor.Spotify_RequetorPackage;
import spotify_Requetor.Track;
import spotify_Requetor.impl.Spotify_RequetorFactoryImpl;

public class XmiHelper {

	public static void main(String[] args) {
		try {
			fillXmiWithJsonData("fakeToken", "artist/David Guetta/only",
					"{  \"artists\" : {    \"href\" : \"https://api.spotify.com/v1/search?query=Rammstein&type=artist&market=FR&offset=0&limit=20\",    \"items\" : [ {      \"external_urls\" : {        \"spotify\" : \"https://open.spotify.com/artist/6wWVKhxIU2cEi0K81v7HvP\"      },      \"followers\" : {        \"href\" : null,        \"total\" : 2913654      },      \"genres\" : [ \"alternative metal\", \"german metal\", \"industrial\", \"industrial metal\", \"industrial rock\", \"neue deutsche harte\" ],      \"href\" : \"https://api.spotify.com/v1/artists/6wWVKhxIU2cEi0K81v7HvP\",      \"id\" : \"6wWVKhxIU2cEi0K81v7HvP\",      \"images\" : [ {        \"height\" : 640,        \"url\" : \"https://i.scdn.co/image/cdf344b2f5124d1f2f1217c45f12096730c70560\",        \"width\" : 640      }, {        \"height\" : 320,        \"url\" : \"https://i.scdn.co/image/d7bba2e8eb624d93d8cc7cb57d9ba5fb35f0f901\",        \"width\" : 320      }, {        \"height\" : 160,        \"url\" : \"https://i.scdn.co/image/019518862c16964fa30906a55ad2cd46f3f35c1a\",        \"width\" : 160      } ],      \"name\" : \"Rammstein\",      \"popularity\" : 87,      \"type\" : \"artist\",      \"uri\" : \"spotify:artist:6wWVKhxIU2cEi0K81v7HvP\"    } ],    \"limit\" : 20,    \"next\" : null,    \"offset\" : 0,    \"previous\" : null,    \"total\" : 1  }}");
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public static void fillXmiWithJsonData(String token, String request, String json) throws JSONException {
		// Initialize the model
		Spotify_RequetorPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		Spotify_RequetorFactory factory = new Spotify_RequetorFactoryImpl();

		CommandManager cm = factory.createCommandManager();
		cm.setToken(token);

		String[] splittedRequest = request.split("/");

		JSONObject jsonToStore = new JSONObject(json);
		switch (splittedRequest[0]) {
		case "artist":
			JSONArray data;
			try {
				data = jsonToStore.getJSONObject("artists").getJSONArray("items");
			} catch (JSONException e1) {
				data = null;
			}
			if (!splittedRequest[2].isEmpty()) {
				// 1 artist only
				fillArtist(data.get(0), factory, cm, null);
				// fill tracks
				try {
					data = jsonToStore.getJSONObject("tracks").getJSONArray("items");
				} catch (JSONException e) {
					data = null;
				}
				if (data != null) {// if Artist has tracks
					for (int i = 0; i < data.length(); i++) {
						fillTrack(data.get(i), factory, cm, null);
					}
				}
				// fill albums
				try {
					data = jsonToStore.getJSONObject("albums").getJSONArray("items");
				} catch (JSONException e) {
					data = null;
				}
				if (data != null) {// if Artist has albums
					for (int i = 0; i < data.length(); i++) {
						fillAlbum(data.get(i), factory, cm, null);
					}
				}
			} else {
				for (int i = 0; i < data.length(); i++) {
					fillArtist(data.get(i), factory, cm, null);
				}
			}
			break;
		case "album":
			JSONArray dataAlbum;
			try {
				dataAlbum = jsonToStore.getJSONObject("albums").getJSONArray("items");
			} catch (JSONException e1) {
				dataAlbum = null;
			}
			JSONArray dataTrack;
			try {
				dataTrack = jsonToStore.getJSONObject("tracks").getJSONArray("items");
			} catch (JSONException e1) {
				dataTrack = null;
			}
			if (!splittedRequest[2].isEmpty()) {
				StatsBean stats;
				if (dataTrack != null) {
					stats = new StatsBean();
					stats.makeStats(dataTrack);
					// 1 artist only
					fillAlbum(dataAlbum.get(0), factory, cm, stats);
					
					// fill tracks
					if (dataAlbum != null) {// if Album has tracks
						for (int i = 0; i < dataAlbum.length(); i++) {
							fillTrack(dataTrack.get(i), factory, cm, stats);
						}
					}
				}
			} else {
				for (int i = 0; i < dataAlbum.length(); i++) {
					fillAlbum(dataAlbum.get(i), factory, cm, null);
				}
			}
			break;
		case "track":
			JSONArray dataTrack1;
			try {
				dataTrack1 = jsonToStore.getJSONObject("tracks").getJSONArray("items");
			} catch (JSONException e1) {
				dataTrack1 = null;
			}
			if (!splittedRequest[2].isEmpty()) {
				if (dataTrack1 != null) {
					StatsBean stats = new StatsBean();
					stats.makeStats(dataTrack1);
					// 1 track only
					fillTrack(dataTrack1.get(0), factory, cm, stats);
				}
			} else {
				for (int i = 0; i < dataTrack1.length(); i++) {
					fillTrack(dataTrack1.get(i), factory, cm, null);
				}
			}
			break;
		case "playlist":
			JSONArray dataPlaylist;
			try {
				dataPlaylist = jsonToStore.getJSONObject("playlists").getJSONArray("items");
			} catch (JSONException e1) {
				dataPlaylist = null;
			}
			JSONArray dataTrack2;
			try {
				dataTrack2 = jsonToStore.getJSONObject("tracks").getJSONArray("items");
			} catch (JSONException e1) {
				dataTrack2 = null;
			}
			if (!splittedRequest[2].isEmpty()) {
				if (dataTrack2 != null) {
					StatsBean stats = new StatsBean();
					stats.makeStats(dataTrack2);
					// 1 playlist only
					fillPlaylist(dataPlaylist.get(0), factory, cm, stats);
				}
			} else {
				for (int i = 0; i < dataPlaylist.length(); i++) {
					fillPlaylist(dataPlaylist.get(i), factory, cm, null);
				}
			}
			break;
		default:
			throw new JSONException("Error, no keyword for fill line");
		}

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		URI fileURI = URI.createFileURI(new File(token + ".xmi").getAbsolutePath());
		System.out.println(fileURI);

		// create a resource
		Resource resource = resSet.createResource(fileURI);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(cm);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void fillArtist(Object data, Spotify_RequetorFactory factory, CommandManager cm, StatsBean stats)
			throws JSONException {
		Artist artist = factory.createArtist();
		artist.setName(((JSONObject) data).get("name").toString());
		artist.setId(((JSONObject) data).get("id").toString());
		artist.setFollowers(((JSONObject) data).get("followers").toString());
		artist.setPopularity(((JSONObject) data).get("popularity").toString());
		JSONArray imagearray = (JSONArray) ((JSONObject) data).get("images");
		artist.setImage(((JSONObject) imagearray.get(0)).get("url").toString());
		cm.getRequest().add(artist);
	}

	private static void fillAlbum(Object data, Spotify_RequetorFactory factory, CommandManager cm, StatsBean stats)
			throws JSONException {
		Album album = factory.createAlbum();
		album.setName(((JSONObject) data).get("name").toString());
		album.setId(((JSONObject) data).get("id").toString());
		album.setRelease_date(((JSONObject) data).get("release_date").toString());
		album.setPopularity(((JSONObject) data).get("popularity").toString());
		JSONArray imagearray = (JSONArray) ((JSONObject) data).get("images");
		album.setImage(((JSONObject) imagearray.get(0)).get("url").toString());
		cm.getRequest().add(album);
	}

	private static void fillTrack(Object data, Spotify_RequetorFactory factory, CommandManager cm, StatsBean stats)
			throws JSONException {
		Track track = factory.createTrack();
		track.setName(((JSONObject) data).get("name").toString());
		track.setId(((JSONObject) data).get("id").toString());
		track.setRelease_date(((JSONObject) data).get("release_date").toString());
		track.setPopularity(((JSONObject) data).get("popularity").toString());
		JSONArray imagearray = (JSONArray) ((JSONObject) data).get("images");
		track.setImage(((JSONObject) imagearray.get(0)).get("url").toString());

		if (stats != null) {
			track.setDanceability(stats.getDanceability());
			track.setInstrumentalness(stats.getInstrumentalness());
			track.setTempo(stats.getDanceability());
			track.setSpeechiness(stats.getDanceability());
			track.setAcousticness(stats.getDanceability());
			track.setValence(stats.getDanceability());
			track.setLoudness(stats.getDanceability());
			track.setLiveness(stats.getDanceability());
			track.setEnergy(stats.getDanceability());
			track.setDuration_ms(stats.getDanceability());
		}
		cm.getRequest().add(track);
	}

	private static void fillPlaylist(Object data, Spotify_RequetorFactory factory, CommandManager cm, StatsBean stats)
			throws JSONException {
		Playlist playlist = factory.createPlaylist();
		playlist.setName(((JSONObject) data).get("name").toString());
		playlist.setId(((JSONObject) data).get("id").toString());
		playlist.setDescription(((JSONObject) data).get("description").toString());
		JSONArray imagearray = (JSONArray) ((JSONObject) data).get("images");
		playlist.setImage(((JSONObject) imagearray.get(0)).get("url").toString());
		cm.getRequest().add(playlist);
	}
}
