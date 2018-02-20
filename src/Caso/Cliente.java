package Caso;

public class Cliente extends Thread{
	
	private int nMensajes;
	
	public Cliente(int nMensajes)
	{
		this.nMensajes=nMensajes;
	}

	public int getnMensajes() {
		return nMensajes;
	}

	public void setnMensajes(int nMensajes) {
		this.nMensajes = nMensajes;
	}
	
	

}
