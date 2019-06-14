package m1ICE.Ping;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

//import java.rmi.RemoteException;

public interface Ping extends Remote {

	void receiveMessage(String oauth, String artiste) throws RemoteException;
	
	public String getRequest(String token, String searchValue, String whatQuerry, String typeQuerry) throws IOException;

}
