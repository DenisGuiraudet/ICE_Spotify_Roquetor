package m1ICE.Ping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.blade.Blade;

import m1ICE.Ping.Ping;
import org.json.JSONObject;

public class PingAppliServer extends java.rmi.server.UnicastRemoteObject implements Ping{

	private static final long serialVersionUID = 7036878533690593349L;
	private int      thisPort;
	private String   thisAddress;
	private Registry registry;    // rmi registry for lookup the remote objects.



	// This method is called from the remote client by the RMI.

	// This is the implementation of the ping interface.

	public void receiveMessage(String oauth, String artiste) throws RemoteException{
		System.out.println(oauth+" , "+artiste);
	}

	public PingAppliServer() throws RemoteException{
		try{
			// get the address of this host.
			thisAddress = (InetAddress.getLocalHost()).toString();
		}catch(Exception e){
			throw new RemoteException("can't get inet address.");
		}

		thisPort = 3232;  // this port(registry's port)
		System.out.println("this address = " + thisAddress + ", port = " + thisPort);
		
		try{
			// create the registry and bind the name and object.
			registry = LocateRegistry.createRegistry(thisPort);
			registry.rebind("pingServer", this);
		}catch(RemoteException e){
			throw e;
		}

	}
	
	public void getResquestArtist() {
		//TODO
		String initRequest = "https://api.spotify.com/v1/artists/";
	}
	
	public String getRequest(String token, String searchValue, String whatQuerry, String typeQuerry) throws IOException{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		
		String request = this.getRequestAsString(whatQuerry, typeQuerry, searchValue);

		HttpGet getRequest = new HttpGet(request);
		this.addSeachRequestHeader(getRequest, token);
		
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
	
	private String getRequestAsString(String whatQuerry, String typeQuerry, String searchValue) {
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
	
	private void addSeachRequestHeader(HttpGet getRequest, String token){
		getRequest.addHeader("Authorization", "Bearer " + token);
		getRequest.addHeader("accept", "application/json");
	}
	// http://127.0.0.1:9000/?value=test&type=artiste&token
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

	    }).start();
	}

}
