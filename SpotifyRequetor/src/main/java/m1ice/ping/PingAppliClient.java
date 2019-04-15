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
       String token = "BQBA4mfgJOfyCSvin50Nae-mF3eCwEId3exigrF7tQWEDPX9134v-AAVJ4Pt9kl_hRTzECEG6mpeJDB-z2xO4zOiJtimt-sv0Sw8G4HA9lhT6IvjtxNWpOL7pHlMUqDp1Vm9qVI-sVOZBIOpoCa5NYhuQOwADpYBCB8ZQSu0u1gaxtnvdAZ3xv0qo-86aRU3oOGGNo77TGgmzEwG9wTKxYXU3_4L3NfiJOprGjUvc5aYMoLGmm_WeBuEyErJK9xzR5o-d7e7sWodP3zoLHTnRpXUbOFHKD7eIEo";
       String idArtiste = "2ijmJLGSSMcUdHI7sfsJIB";

       System.out.println("sending " + idArtiste + " to " + serverAddress + " : " + serverPort);
       try{
           // get the registry
           registry = LocateRegistry.getRegistry(serverAddress, (new Integer(serverPort)).intValue());
           // look up the remote object
           pingServer = (Ping)(registry.lookup("pingServer"));
           // call the remote method
           pingServer.receiveMessage(token, idArtiste);
           PingAppliClient.printResponse(pingServer.getRequest(token, idArtiste));
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
