package Caso;

public class Mensaje extends Thread{

	private  int mensaje;
	
	public Mensaje(int mensaje)
	{
		this.mensaje=mensaje;
	}

	public int getMensaje() {
		return mensaje;
	}

	public void setMensaje(int mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
