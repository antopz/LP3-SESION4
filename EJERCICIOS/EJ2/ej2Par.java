package EJERCICIOS;

public class ej2Par<F, S> {

	private F e1;
	private S e2;
	
	public ej2Par(F e1, S e2) {
		this.setE1(e1);
		this.setE2(e2);
	}

	public S getE2() {
		return e2;
	}

	public void setE2(S e2) {
		this.e2 = e2;
	}

	public F getE1() {
		return e1;
	}

	public void setE1(F e1) {
		this.e1 = e1;
	}
	
	public boolean esIgual(ej2Par<F,S> otro) {
		if(otro==null) {
			return false;
		}
		return this.e1.equals(otro.getE1()) && this.e2.equals(otro.getE2());
	}
	@Override
	public String toString() {
		return "Primero: "+e1+"\nSegundo: "+e2;
	}	
}
