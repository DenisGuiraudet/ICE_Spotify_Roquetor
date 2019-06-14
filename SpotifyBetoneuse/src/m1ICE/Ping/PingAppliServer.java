package m1ICE.Ping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import com.blade.Blade;

public class PingAppliServer{

	private static final long serialVersionUID = 7036878533690593349L;
	
	public static String getRequest(String token, String searchValue, String whatQuerry, String typeQuerry) throws IOException{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		
		String request = PingAppliServer.getRequestAsString(whatQuerry, typeQuerry, searchValue);

		HttpGet getRequest = new HttpGet(request);
		PingAppliServer.addSeachRequestHeader(getRequest, token);
		
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
		}
	}
	
	private static String getRequestAsString(String whatQuerry, String typeQuerry, String searchValue) {
		StringBuilder strBuilder = new StringBuilder();
		if("search".equals(whatQuerry)) {
			strBuilder.append("https://api.spotify.com/v1/search?query=");			
		}
		if("show".equals(whatQuerry)) {
			strBuilder.append("https://api.spotify.com/v1/show?query=");
		}
		strBuilder.append(searchValue);
		strBuilder.append("&type=");
		strBuilder.append(typeQuerry);
		
		return strBuilder.toString();
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
	        	Json = PingAppliServer.getRequest(token, value, only, type);
	        }
	        catch (IOException e) {
				e.printStackTrace();
			}
	        ctx.text("oui");
	    }).start();
	}

}
