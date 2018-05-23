package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class OyenteServidor implements Runnable {

	BufferedReader pin;
	PrintWriter pout;
	
	
	public OyenteServidor (BufferedReader pin, PrintWriter pout) {
		this.pin=pin;
		this.pout=pout;

	}
	
	
	
	@Override
	public void run() {
		
			
	}

}
