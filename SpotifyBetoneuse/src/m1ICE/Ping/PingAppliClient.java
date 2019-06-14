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
       String token = "BQAQF74qjSYKZzcXiimDd_dXJ8voKhKUa8t4fIAovGDGwVM9NlNeZJhtqOKENWUrzOHkE1x0CuSHU8V9VzGyeR6lEKDWXEAc-HuiMzwciPr2wPPUrWaEmvhS7uRViJm8I2hj_xauwetDb252iJw0slQOzG4CCuJ8yO9StLT8buyOg0szGvFgOmcWhf3jOiEgeUSl0HuDrJ9BmRW-f7yvO-RAVZoN6dBBWNri-DpjDpN8kn_iLLL4CUU4TYnFlzduT2ZN6-OK9PLs1J9IKHZ3jlYI0yTmtx2SQ1M";
       String searchValue = "Rammstein";

       System.out.println("sending " + searchValue + " to " + serverAddress + " : " + serverPort);
       try{
           // get the registry
           registry = LocateRegistry.getRegistry(serverAddress, (new Integer(serverPort)).intValue());
           // look up the remote object
           pingServer = (Ping)(registry.lookup("pingServer"));
           // call the remote method
           pingServer.receiveMessage(token, searchValue);
           String response = pingServer.getRequest(token, searchValue, "search", "album");
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
