package ListaCircular;


public class ListaCircular {

	private Elemento cabeca;
	private Elemento cauda;

	public ListaCircular() {
		cabeca = cauda = null;
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return cabeca == null && cauda == null;
	}

	public void add(Object valor) throws Exception {
		System.out.println("Adicionando " + valor + " a lista.");
		Elemento e = new Elemento(valor);
		if (cauda != null) {
			cauda.setProximo(cabeca);
			cabeca.setAnterior(cauda);
		}
		e.setAnterior(cauda);
		cauda = e;
		if (cabeca == null) {
			cabeca = cauda;
		}

	}
	
	
	
	
	public void list() {
		Elemento e = cabeca;

		while (e != null) {
			System.out.println("Valor " + e.getValor());
			e = e.getProximo();
		}

	}
	
}
