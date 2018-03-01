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
		mensajes.add(mensaje);
	}
	public synchronized boolean atender()
	{
		if(mensajes.size()>0)
		{
			Mensaje m=mensajes.get(0);
			int msg=m.getMensaje();
			int ms=msg;
			ms+=1;
			m.setMensaje(ms);
			m.notifyAll();
			mensajes.remove(m);
			return true;
		}
		return false;
	}
	
	

}
