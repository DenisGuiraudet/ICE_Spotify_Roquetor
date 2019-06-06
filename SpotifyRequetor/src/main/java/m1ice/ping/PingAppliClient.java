package m1ice.ping;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PingAppliClient
{
    static public void main(String args[])
    {
       Ping pingServer;
       Registry registry;
       String serverAddress = "localhost";
       String serverPort = "3232";
       String token = "BQAMRPZoU0KKyaJI-7a1iMPqFLOXD8KbM1lHLPkxlcGOee_HQzR5i8VXhrX_GzUHAGqCD5Q5vCqJTVIR7lPIyho5vuWtlw_zBxn1dfYRVEXVYYiSxUbbYO_g7dIggTtXlE5VLt91hSm2uYZIbgzIKIh1ZDZ9YWpSCiFsgZssHIlRl9QSiIF3_qKI1kxTM39b45SnEgMiS0SxeyNKoU4FbIW-PD6rLKpMU-B9ns252OYBGwtRcYUae5_eyUIoeogELy9kSHvvF5BS4YPf7ZDZQtlugxSAtCmTF60";
       String searchValue = "Rammstein";

       System.out.println("sending " + searchValue + " to " + serverAddress + " : " + serverPort);
       try{
           // get the registry
           registry = LocateRegistry.getRegistry(serverAddress, (new Integer(serverPort)).intValue());
           // look up the remote object
           pingServer = (Ping)(registry.lookup("pingServer"));
           // call the remote method
           pingServer.receiveMessage(token, searchValue);
           String response = pingServer.getRequest(token, searchValue, "artist");
           PingAppliClient.printResponse(response);
       }
       catch(RemoteException e){
           e.printStackTrace();
       }
       catch(NotBoundException e){
           e.printStackTrace();
       } catch (IOException e) {
		e.printStackTrace();
	}
    }
    
    private static void printResponse(String response) throws UnsupportedOperationException, IOException {
    	FileOutputStream fos = new FileOutputStream("httpResponse.json");
    	OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
    	osw.write(response);
    	osw.close();
    	fos.close();
    }
}
