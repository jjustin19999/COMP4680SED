import java.io.OutputStream;
import java.net.PrintWriter;
import java.net.Socket;

public class DemoSender{
	
	public static void main(String args[]){
        try{
			String _str; //declare variable for later use
			
			Socket _socket = new Socket("cyrus-sir.com", 12345); //create the client socket
			OutputStream out = skt.getOutputStream();

			PrintWriter _writer = new PrintWriter(out, true); //prepare the output stream
            
			
			writer.println("s13458821");//write data to output stream
			//repeat read and send user input
            socket.close();//or close the connection
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
		
		
	
