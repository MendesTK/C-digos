package ListaCircular;


public class Elemento<T> {

	private Elemento<T> proximo;
	private Elemento<T> anterior;
	private T valor;

	public Elemento(T v) {
		valor = v;
	}

	public Elemento<T> getProximo() {
		return proximo;
	}

	public void setProximo(Elemento<T> e) {
		this.proximo = e;
	}

	public Elemento<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Elemento<T> e) {
		this.anterior = e;
	}

	public T getValor() {
		return valor;
	}
	
}
