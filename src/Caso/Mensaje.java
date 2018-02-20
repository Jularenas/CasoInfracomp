package Caso;

public class Mensaje extends Thread{

	private  String mensaje;
	
	public Mensaje(String mensaje)
	{
		this.mensaje=mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
