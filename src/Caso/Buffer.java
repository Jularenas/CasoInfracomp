package Caso;

import java.util.ArrayList;


public class Buffer {
	
	private ArrayList<Mensaje> mensajes;
	
	public Buffer()
	{
		mensajes= new ArrayList<>();
	}

	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(ArrayList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
	

}
