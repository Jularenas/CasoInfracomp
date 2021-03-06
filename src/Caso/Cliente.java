package Caso;

public class Cliente extends Thread{
	
	private int nMensajes;
	
	private Buffer buffer;
	
	public Cliente(int nMensajes, Buffer buffer)
	{
		this.nMensajes=nMensajes;
		this.buffer=buffer;
	}
	
	public synchronized void enviarMensaje(Mensaje mensaje)
	{
		buffer.enviar(mensaje);
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
				Mensaje m= new Mensaje((int)(Math.random()*1000+1));
				synchronized (m) {
					enviarMensaje(m);
					System.out.println("entra mensaje: " + m.getMensaje());
					i++;
					m.wait();
					System.out.println("sale mensaje: " + m.getMensaje());
				}

			}
			catch(Exception e)
			{
				yield();
				continue;
			}
		}
	}

}
