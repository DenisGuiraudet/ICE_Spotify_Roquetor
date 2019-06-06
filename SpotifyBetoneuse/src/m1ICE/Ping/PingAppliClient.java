package m1ICE.Ping;

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
       String token = "BQCK8XFE6zDMzaEq_HUxZUIfYIJ9Mnq5QzMTzjTeeGgCpGd6nK8eBZkGK03BLJ9-ayMCTwmVVQ8iTTU4Xmg3iEvndOiQI8W-ZnSTtknYc_jFjXAWH7MNAIGntnGJLZ446NZ1IQqRT92e4yK_dW9r0OHUH91Akx4TCn4zGdCvhnZAR8Fxg-fmJZIH1-Qu6o6nfmWyakYKG9UWvXCl9Kngp5Cz9NRz5q3zuXNqnHEg3tI6oLuwMNtmoCA-3iTXkrlhlWPrptLFU6hATKs";
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
