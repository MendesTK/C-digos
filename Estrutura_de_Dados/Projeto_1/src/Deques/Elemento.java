package Deques;

public class Elemento {
	
	private Elemento proximo;
	private Elemento anterior;
	private Object valor;
	
	public Elemento(Object v){
		valor = v;
	}
	
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento e) {
		this.proximo = e;
	}
	public Elemento getAnterior() {
		return anterior;
	}
	public void setAnterior(Elemento e) {
		this.anterior = e;
	}
	public Object getValor() {
		return valor;
	}
	
	

}
