package parte2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class OyenteCliente implements Runnable {

	String id;
	Socket socket;
	BufferedReader fin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	PrintWriter fout = new PrintWriter(socket.getOutputStream());
	
	public OyenteCliente(Socket s) throws IOException{
		this.socket=s;
	}
	
	@Override
	public void run() {
		
		while (true){
			try {
				String m = fin.readLine();
				fout.println(m);
				fout.println("Seica isto furrula:");
				fout.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
