package servidor;

import java.util.ArrayList;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {
	
	ArrayList<String> usersList; //Será Usuario y no String
	ArrayList<Socket> socketList;
	//ServerSocket l;
	
	public Servidor(){
	}
	
	
	static ArrayList<String> readUsers(String fileName) throws IOException {
	    /*Scanner sc = new Scanner(new FileReader(fileName));
	    try {
	        String text = "";
	        String line = "";

	        while (sc.hasNextLine()) {
	            line = sc.nextLine();
	            text = text+line;
	            
	        }
	        return text;
	    } finally {
	        sc.close();
	    }*/
		return null;
	}
	
	
	
	public void runServer(ArrayList<String> uList,ArrayList<Socket> sList) throws IOException {
		
		System.out.println("Servidor iniciado");
		while (true) {
			ServerSocket l = new ServerSocket(500);
			Socket s = l.accept();
			(new OyenteCliente(s, uList, sList)).run();
			
		}
		
	}
	
	
	
	public static void main (String args[]) throws IOException {
		
		
		ArrayList<String> uList = new ArrayList<String>();
		ArrayList<Socket> sList = new ArrayList<Socket>();
		Servidor server = new Servidor();
		
		server.usersList = uList;
		server.socketList =sList;
		
		server.runServer(uList,sList);
		
	}

}
