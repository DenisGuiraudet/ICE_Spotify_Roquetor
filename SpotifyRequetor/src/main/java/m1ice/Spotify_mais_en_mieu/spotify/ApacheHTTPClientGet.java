package m1ice.Spotify_mais_en_mieu.spotify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class ApacheHTTPClientGet {

	public static void main(String[] args) {
		System.out.println("Server starting");
		DefaultHttpClient httpClient = new DefaultHttpClient();
	  try {

		
		
		String oauth = "BQDaQSqAWwD2Q_-xwAcXACofCaq_3aw63NbnG0clV3-GS2egdRSBVdZzJkGRPjNSZlnUcbDmL4JdEKfm1cZZkrdtILNHXbY6Sm8F6muyMugN5ZPE1KyKgNHYljB_AXlNXJr75koGRYjv6iv0Up6LkMsBmgV7bLPQzrZ2kteflyqMk1jKcp2bB5zJmgCIFgwQHx1MG73tWNdObrGrdvoLTExnfH6hC3zLpOFCKu9yrLMQcR-io4h0ODhEkXm3gUd_ZIe6GMDICQIHJjv6-MfjIRgdTORwBFH5uhU";
		String request = "https://api.spotify.com/v1/artists/";
		request += "2ijmJLGSSMcUdHI7sfsJIB";		//AC/DC
		HttpGet getRequest = new HttpGet(request);
		getRequest.addHeader("Authorization", "Bearer " + oauth);
		getRequest.addHeader("accept", "application/json");


		HttpResponse response = httpClient.execute(getRequest);

		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			   + response.getStatusLine().getStatusCode() + " "
			   + response.getStatusLine().getReasonPhrase());
		}

		BufferedReader br = new BufferedReader(
                         new InputStreamReader((response.getEntity().getContent())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		
		while(true) {
			System.out.println("Hello World");
			Thread.sleep(5000);
		}
		
		

	  } catch (ClientProtocolException e) {	
		e.printStackTrace();

	  } catch (IOException e) {
	
		e.printStackTrace();
	  } catch (InterruptedException e) {
		System.out.println("Shutdown");
		httpClient.getConnectionManager().shutdown();
		e.printStackTrace();
	}

	}

}