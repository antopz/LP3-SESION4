package Actividades;

public class ExceptionPilaVacia extends IllegalArgumentException{
	public ExceptionPilaVacia() {}
	
	public ExceptionPilaVacia(String mensaje) {
		super(mensaje);
	}
}
