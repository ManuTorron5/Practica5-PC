package parte2;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Servidor {
	
	ArrayList<Usuario> usersList;
	ArrayList<Socket> socketList;
	//ServerSocket l;
	
	public Servidor(ArrayList<Usuario> usersList){
		this.usersList=usersList;
	}
	
	
	static ArrayList<Usuario> readUsers(String fileName) throws IOException {
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
	
	
	
	public static void runServer() throws IOException {
		
		while (true) {
			ServerSocket l = new ServerSocket(500);
			Socket s = l.accept();
			(new OyenteCliente(s)).run();
		}
		
		
	}
	
	
	
	public static void main (String args[]) throws IOException {
		
		
		ArrayList<Usuario> usersList = new ArrayList<Usuario>();
		usersList = readUsers("users.txt");
		Servidor s = new Servidor(usersList);
		
		runServer();
		
	}

}
