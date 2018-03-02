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
	public synchronized void enviar(Mensaje mensaje)
	{
		System.out.println("entra mensaje: " + mensaje.getMensaje());
		mensajes.add(mensaje);
	}
	public synchronized boolean atender()
	{
		if(mensajes.size()>0)
		{
			Mensaje m=mensajes.get(0);
			mensajes.remove(m);
			int msg=m.getMensaje();
			int ms=msg;
			ms+=1;
			m.setMensaje(ms);
			m.notify();
			System.out.println("sale mensaje: " + m.getMensaje());
			return true;
		}
		return false;
	}
	
	

}
