package m1ICE.Ping;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

//import java.rmi.RemoteException;

public interface Ping extends Remote {

	void receiveMessage(String oauth, String artiste) throws RemoteException;
	
	String getRequest(String token, String request, String type) throws IOException;

}
