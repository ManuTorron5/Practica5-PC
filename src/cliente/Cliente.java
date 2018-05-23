package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	String userName;
	String ip;
	Socket sb;
	BufferedReader pin;
	PrintWriter pout;
	
	public Cliente (String userName) throws IOException {
		this.userName=userName;
		this.ip = InetAddress.getLocalHost().getHostAddress();
		
		
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
	public void getUsersList() {
		
		
	}
	
	public void download() {
		
		
	}
	
	public void inicializarSocket() throws UnknownHostException, IOException {
		
		sb = new Socket(ip, 500);
		pin = new BufferedReader(new InputStreamReader(sb.getInputStream()));
		pout = new PrintWriter(sb.getOutputStream());
		
		OyenteServidor os = new OyenteServidor(pin,pout);
		os.run();
		
	}
	

	
	
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nombre de usuario: ");
		String userName = sc.nextLine();
		Cliente c = new Cliente(userName);
		
		c.inicializarSocket();
		
		c.pout.println("EstCon");
		c.pout.flush();
		
		c.pout.println(userName);
		c.pout.flush();
		
		
		String msg = c.pin.readLine();
		
		System.out.println(msg);
		
		sc.close();
	}

	

	

}
