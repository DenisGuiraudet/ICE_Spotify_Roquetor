package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.blade.Blade;

import dsl.XmiHelper;

public class SpotifyRequetorServer{

	private static final String apiUrl = "https://api.spotify.com/v1";
	
	public static String getRequest(String token, String whatQuerry, String typeQuerry, String searchValue) throws IOException{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		
		String request = SpotifyRequetorServer.getRequestAsString(whatQuerry, typeQuerry, searchValue);
		HttpGet getRequest = new HttpGet(request);
		SpotifyRequetorServer.addSeachRequestHeader(getRequest, token);
		
		try {
			HttpResponse response = httpClient.execute(getRequest);
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
				   + response.getStatusLine().getStatusCode() + " "
				   + response.getStatusLine().getReasonPhrase());
			}

			BufferedReader br = new BufferedReader(
	                         new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Sending http response .... \n");
			StringBuilder strBuilder = new StringBuilder();
			
			while ((output = br.readLine()) != null) {
				strBuilder.append(output);
			}
			
			String Json = strBuilder.toString();
			return Json;
		} catch (IOException e) {
			throw e;
		} finally {
			httpClient.close();
		}
	}
	
	private static String getRequestAsString(String whatQuerry, String typeQuerry, String searchValue) {
		searchValue = searchValue.replaceAll(" ", "%20");

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(apiUrl);
		if("search".equals(whatQuerry) || "show".equals(whatQuerry)) {
			strBuilder.append("/search?query=");			
			strBuilder.append(searchValue);
			strBuilder.append("&type=");
			strBuilder.append(typeQuerry);
			
			if("show".equals(whatQuerry)) {
				strBuilder.append("&limit=1");
			}
		}
		
		if("albums".equals(whatQuerry)) {
			strBuilder.append("/albums/");	
			strBuilder.append(searchValue);
			strBuilder.append("/tracks");
		}
		if("audioFeatures".equals(whatQuerry)) {
			strBuilder.append("/audio-features?ids=");	
			strBuilder.append(searchValue);
		}
		
		return strBuilder.toString();
	}
	
	private static String getFeaturesOfAlbum(String token, String albumName) throws JSONException {
		String jsonSearchAlbum = "";
		try {
			jsonSearchAlbum = SpotifyRequetorServer.getRequest(token, "show", "album", albumName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String idAlbum = SpotifyRequetorServer.getIdOfAlbum(jsonSearchAlbum);				
		
		String jsonGetTracksOfAlbum = "";
		try {
			jsonGetTracksOfAlbum = SpotifyRequetorServer.getRequest(token, "albums", "useless", idAlbum);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		List<String> listIdOfTracksInAlbum = SpotifyRequetorServer.getAllIdsOfTrackInAlbum(jsonGetTracksOfAlbum);
		
		StringBuilder catIds = new StringBuilder();
		for(String id : listIdOfTracksInAlbum) {
			catIds.append(id + ",");
		}
		String idsCat = catIds.toString();
		
		String jsonFeaturesOfTracks = "";
		try {
			jsonFeaturesOfTracks = SpotifyRequetorServer.getRequest(token, "audioFeatures", "useless", idsCat);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonFeaturesOfTracks;
	}
	
	private static String getIdOfAlbum(String jsonOfShowAlbum) throws JSONException {
		//parse JsonSearchAlbum to get Id of the album
		JSONObject jsonObj = new JSONObject(jsonOfShowAlbum);
		JSONObject albumsObject = jsonObj.getJSONObject("albums");
		JSONArray itemsArray = albumsObject.getJSONArray("items");
		JSONObject itemObject = (JSONObject)itemsArray.get(0);
		String idAlbum = itemObject.getString("id");
		
		return idAlbum;
	}
	
	private static List<String> getAllIdsOfTrackInAlbum(String jsonTracksOfAlbum) throws JSONException{
		//parse JsonGetAlbum to get all tracks		
		List<String> ListIdOfAllTracksInAlbum = new ArrayList<String>();
		JSONObject jsonObj = new JSONObject(jsonTracksOfAlbum);
		JSONArray itemsArray = jsonObj.getJSONArray("items");
		for(int i = 0; i < itemsArray.length(); i++) {
			JSONObject itemObject = (JSONObject)itemsArray.get(i);
			String idTrack = itemObject.getString("id");
			ListIdOfAllTracksInAlbum.add(idTrack);
		}
		return ListIdOfAllTracksInAlbum;
	}
	
	private static void addSeachRequestHeader(HttpGet getRequest, String token){
		getRequest.addHeader("Authorization", "Bearer " + token);
		getRequest.addHeader("accept", "application/json");
	}
	// http://127.0.0.1:9000/?value=test&type=artist&token
	static public void main(String args[]){
		Blade.of().get("/", ctx -> {
	        String value = ctx.fromString("value");
	        String type = ctx.fromString("type");
	        String token = ctx.fromString("token");
	        String only = ctx.fromString("only");
	        if (only != null) {
	        	only = "show";
	        } else {
	        	only = "search";
	        }
	        System.out.println("value is:" + value);
	        System.out.println("token is:" + token);
	        System.out.println("type is:" + type);
	        String Json = "";	        
	        try {
	        	Json = SpotifyRequetorServer.getRequest(token, only, type, value);
	        }
	        catch (IOException e) {
				e.printStackTrace();
			}
	        String req = type + "/" + value + "/" + only;
	        System.out.println("req is:" + req);
	        try {
	        	System.out.println("debutDSL:");
				XmiHelper.fillXmiWithJsonData(token, req, Json);
				System.out.println("finDSL:");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        ctx.text("ok");
	    }).start();
	}

}