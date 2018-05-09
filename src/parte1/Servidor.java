package parte1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Servidor {
	
	String readFile(String fileName) throws IOException {
	    Scanner sc = new Scanner(new FileReader(fileName));
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
	    }
	}
	
	public void runServer() throws IOException {
		
	
		ServerSocket l = new ServerSocket(500);
		Socket sa = l.accept();
		
		System.out.println("Conexión establecida");
		
		BufferedReader fin = new BufferedReader (new InputStreamReader(sa.getInputStream()));
		PrintWriter fout = new PrintWriter(sa.getOutputStream());
		
	
		String fileName = fin.readLine();
		System.out.println("Leyendo el fichero " + fileName);
		fileName = "C:/hlocal/workspace-4.7-64bits/Practica5PC/src/parte1/" + fileName;
		String datos = readFile(fileName);
		System.out.println("Enviando datos...");
		
		fout.println(datos);
		fout.flush();
		
		System.out.println("Finalizando conexión");
		
		sa.close();
		fin.close();
		fout.close();
		l.close();
	}
	
	
	
	public static void main (String args[]) throws IOException {
		
		Servidor s = new Servidor();
		s.runServer();
	}

}
