package parte1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	
	public void runCliente() throws UnknownHostException, IOException {
		
		Socket sb = new Socket("localhost", 500);
		BufferedReader pin =  new BufferedReader(new InputStreamReader(sb.getInputStream()));
		PrintWriter pout = new PrintWriter (sb.getOutputStream());
		

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
	
	public static void main (String args[]) throws IOException {
		Cliente c = new Cliente();
		c.runCliente();
	}
	

}
