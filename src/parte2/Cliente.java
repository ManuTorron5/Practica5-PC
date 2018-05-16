package parte2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	String userName;
	String ip;
	Socket sb;
	BufferedReader pin = new BufferedReader(new InputStreamReader(sb.getInputStream()));
	PrintWriter pout = new PrintWriter(sb.getOutputStream());
	
	public Cliente (String userName) throws UnknownHostException, IOException{
		this.userName=userName;
		this.ip = "localhost";
		sb = new Socket(ip, 500);
	}
	
	/*public void runCliente() throws UnknownHostException, IOException {
		
		
		String fileName = "datos.txt";
		pout.println(fileName);
		pout.flush();
		
		System.out.println("Recibiendo datos del Servidor...");
		String datos = pin.readLine();
		System.out.println(datos);
		
		System.out.println("Finalizando conexión");
		
		sb.close();
		pin.close();
		pout.close();
	}
	*/
	private void getUsersList() {
		
		
	}
	
	private void download() {
		
		
	}
	
	
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nombre de usuario: ");
		String userName = sc.next();
		Cliente c = new Cliente(userName);
		
		
		
		System.out.println("Menú:");
		System.out.println("1. Obtener lista de usuarios");
		System.out.println("2. Descargar archivos");
		
		if (sc.nextInt()==1) c.getUsersList();
		else c.download();
		
		
		//c.runCliente();
		
		sc.close();
	}

	

	

}
