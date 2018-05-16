package parte2;

import java.util.ArrayList;


public class Usuario {
	
	private String name;
	private String ip;
	private ArrayList<String> listaFicheros; 
	
	public Usuario(String name, String ip, ArrayList<String> listaFicheros){
		this.setName(name);
		this.setIp(ip);
		this.setListaFicheros(listaFicheros);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public ArrayList<String> getListaFicheros() {
		return listaFicheros;
	}

	public void setListaFicheros(ArrayList<String> listaFicheros) {
		this.listaFicheros = listaFicheros;
	}
	
	
}
