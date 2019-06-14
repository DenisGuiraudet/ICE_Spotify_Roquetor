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
			fillXmiWithJsonData("fakeToken","artist/David Guetta/only","{  \"artists\" : {    \"href\" : \"https://api.spotify.com/v1/search?query=Rammstein&type=artist&market=FR&offset=0&limit=20\",    \"items\" : [ {      \"external_urls\" : {        \"spotify\" : \"https://open.spotify.com/artist/6wWVKhxIU2cEi0K81v7HvP\"      },      \"followers\" : {        \"href\" : null,        \"total\" : 2913654      },      \"genres\" : [ \"alternative metal\", \"german metal\", \"industrial\", \"industrial metal\", \"industrial rock\", \"neue deutsche harte\" ],      \"href\" : \"https://api.spotify.com/v1/artists/6wWVKhxIU2cEi0K81v7HvP\",      \"id\" : \"6wWVKhxIU2cEi0K81v7HvP\",      \"images\" : [ {        \"height\" : 640,        \"url\" : \"https://i.scdn.co/image/cdf344b2f5124d1f2f1217c45f12096730c70560\",        \"width\" : 640      }, {        \"height\" : 320,        \"url\" : \"https://i.scdn.co/image/d7bba2e8eb624d93d8cc7cb57d9ba5fb35f0f901\",        \"width\" : 320      }, {        \"height\" : 160,        \"url\" : \"https://i.scdn.co/image/019518862c16964fa30906a55ad2cd46f3f35c1a\",        \"width\" : 160      } ],      \"name\" : \"Rammstein\",      \"popularity\" : 87,      \"type\" : \"artist\",      \"uri\" : \"spotify:artist:6wWVKhxIU2cEi0K81v7HvP\"    } ],    \"limit\" : 20,    \"next\" : null,    \"offset\" : 0,    \"previous\" : null,    \"total\" : 1  }}");
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
		JSONArray data;
		switch (splittedRequest[0]) {
			case "artist":
				data = jsonToStore.getJSONObject("artists").getJSONArray("items");
				if(!splittedRequest[2].isEmpty()){// 1 artist only
					fillArtist(data.get(0),factory,cm);
				}else {
					for(int i = 0; i < data.length(); i++){
						fillArtist(data.get(i),factory,cm);
					}
				}
				break;
			case "album":
				data = jsonToStore.getJSONObject("albums").getJSONArray("items");
				if(!splittedRequest[2].isEmpty()){// 1 artist only
					fillAlbum(data.get(0),factory,cm);
				}else {
					for(int i = 0; i < data.length(); i++){
						fillAlbum(data.get(i),factory,cm);
					}
				}
				break;
			case "track":
				data = jsonToStore.getJSONObject("tracks").getJSONArray("items");
				if(!splittedRequest[2].isEmpty()){// 1 track only
					fillTrack(data.get(0),factory,cm);
				}else {
					for(int i = 0; i < data.length(); i++){
						fillTrack(data.get(i),factory,cm);
					}
				}
				break;
			case "playlist":
				data = jsonToStore.getJSONObject("playlists").getJSONArray("items");
				if(!splittedRequest[2].isEmpty()){// 1 track only
					fillPlaylist(data.get(0),factory,cm);
				} else {
					for(int i = 0; i < data.length(); i++){
						fillPlaylist(data.get(i),factory,cm);
					}
				}
				break;
			default:
				throw new JSONException("Error, no keyword for fill line");
		}
		
		
		
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resSet.getResourceFactoryRegistry()
		.getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
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

	private static void fillArtist(Object data, Spotify_RequetorFactory factory, CommandManager cm) throws JSONException {
		Artist artist = factory.createArtist();
		artist.setName(((JSONObject)data).get("name").toString());
		cm.getRequest().add(artist);
	}
	private static void fillAlbum(Object data, Spotify_RequetorFactory factory, CommandManager cm) throws JSONException {
		Album album = factory.createAlbum();
		album.setName(((JSONObject)data).get("name").toString());
		cm.getRequest().add(album);
	}
	private static void fillTrack(Object data, Spotify_RequetorFactory factory, CommandManager cm) throws JSONException {
		Track track = factory.createTrack();
		track.setName(getJsonAttribute(data,"name"));
		cm.getRequest().add(track);
	}
	private static void fillPlaylist(Object data, Spotify_RequetorFactory factory, CommandManager cm) throws JSONException {
		Playlist playlist = factory.createPlaylist();
		playlist.setName(((JSONObject)data).get("name").toString());
		cm.getRequest().add(playlist);
	}
	
	
	private static String getJsonAttribute(Object data, String attr) throws JSONException {
		return ((JSONObject)data).get(attr).toString();
	}
}
