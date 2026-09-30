package Actividades;

public class Pila<E>{
	private final int tamanio;
	private int superior;
	private E[] elementos;
	
	public Pila() {
		this(10);
	}
	public Pila(int s) {
		tamanio=s>0 ? s:10;
		superior=-1;		//se coloca -1 para que inicie en el valor 0 al incrementarse en push
		elementos=(E[]) new Object[tamanio];
	}
	
	public void push(E valorAMeter) {
		if (superior==tamanio-1) {
			throw new ExceptionPilaLlena(String.format("La pila esta llena, no se puede meter %s", valorAMeter));
		}
		elementos[++superior]=valorAMeter;
	}
	
	public E pop() {
		if (superior==-1) {
			throw new ExceptionPilaVacia("Pila vacia, no se puede sacar");
		}
		return elementos[superior--];
	}
	
	//
	public boolean contains(E elemento) {
		for (int i = superior; i >= 0; i--) {
            if (elemento == null) {
                if (elementos[i].equals(elemento)) {
                	return true;
                }
            }
        }
        return false;
	}	

}