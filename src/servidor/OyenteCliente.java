package servidor;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;


public class OyenteCliente implements Runnable {

	String id;
	Socket socket;
	BufferedReader fin;
	PrintWriter fout;
	
	List<String> userList;
	List<Socket> socketList;
	
	public OyenteCliente(Socket s, List<String> userList, List<Socket> socketList) throws IOException{
		this.socket=s;
		this.userList=userList;
		this.socketList=socketList;
	}
	
	@Override
	public void run() {
		
		while (true){
			try {
				
				BufferedReader fin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter fout = new PrintWriter(socket.getOutputStream());
				
				String m = fin.readLine();
				if (m.equals("EstCon")) {
					String user = fin.readLine();
					userList.add(user);
					fout.println("Conexion establecida");
					
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
