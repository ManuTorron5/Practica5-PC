package mensaje;

import java.io.Serializable;

public abstract class Mensaje implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	int tipo;
	String origen;
	String destino;
	String info;
	
	public int getTipo(){
		return this.tipo;
	}
	
	public String getOrigen(){
		return this.origen;
	}
	
	public String getDestino(){
		return this.destino;
	}
	
}
