package m1ice.ping;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

import org.apache.http.HttpResponse;

//import java.rmi.RemoteException;

public interface Ping extends Remote {

	void receiveMessage(String oauth, String artiste) throws RemoteException;
	
	String getRequest(String token, String request) throws IOException;

}
