package m1ice.ping;

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
import m1ice.ping.Ping;

public class PingAppliServer extends java.rmi.server.UnicastRemoteObject implements Ping{

	private static final long serialVersionUID = 7036878533690593349L;

	int      thisPort;

	String   thisAddress;

	Registry registry;    // rmi registry for lookup the remote objects.



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
	
	@Override
	public String getRequest(String token, String request, String type) throws IOException{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		
		SearchTypeEnum searchType = this.getSearchType(type);		
		String initRequest = "https://api.spotify.com/v1/search?query=";
		request = initRequest + request;
		request += "&type=artist";

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
			
			return strBuilder.toString();
		} catch (IOException e) {
			throw e;
		}
	}
	
	private SearchTypeEnum getSearchType(String type) {
		switch (type) {
		case "artist":
			return SearchTypeEnum.ARTIST;
		case "album":
			return SearchTypeEnum.ALBUM;
		case "track":
			return SearchTypeEnum.TRACK;
		case "playlist":
			return SearchTypeEnum.PLAYLIST;
		default:
			return SearchTypeEnum.UNKNOWN;
		}
	}
	
	private void addSeachRequestHeader(HttpGet getRequest, String token){
		getRequest.addHeader("Authorization", "Bearer " + token);
		getRequest.addHeader("accept", "application/json");
	}
	
	static public void main(String args[]){
		try{
			PingAppliServer s = new PingAppliServer();
		}catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

}
