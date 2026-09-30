package Actividades;

public class ExceptionPilaLlena extends IllegalArgumentException {
	public ExceptionPilaLlena() {}
	
	public ExceptionPilaLlena(String mensaje) {
		super(mensaje);
	}
}
