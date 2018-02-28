package Caso;

public class Cliente extends Thread{
	
	private int nMensajes;
	
	private Buffer buffer;
	
	public Cliente(int nMensajes, Buffer buffer)
	{
		this.nMensajes=nMensajes;
		this.buffer=buffer;
	}
	
	public synchronized void enviarMensaje(Integer mensaje)
	{
		buffer.enviar(new Mensaje(""+mensaje));
	}
	public int getnMensajes() {
		return nMensajes;
	}

	public void setnMensajes(int nMensajes) {
		this.nMensajes = nMensajes;
	}
	
	@Override
	public void run ()
	{
		int i=0;
		while(i<nMensajes)
		{
			try{
				enviarMensaje((int)(Math.random()*1000+1));
			}
			catch(Exception e)
			{
				yield();
				continue;
			}
		}
	}

}
