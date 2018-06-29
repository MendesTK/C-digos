package ListaCircular;

import java.util.List;
import java.util.function.Function;


public class ListaCircular<T> {

	private Elemento<T> cabeca;
	private Elemento<T> cauda;

	public ListaCircular() {
		cabeca = cauda = null;
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return cabeca == null && cauda == null;
	}

	public void add(T valor) throws Exception {
		System.out.println("Adicionando " + valor + " ao final da lista.");
		Elemento<T> e = new Elemento<T>(valor);
		if (cauda != null) {
			cauda.setProximo(e);

		}
		e.setAnterior(cauda);
		cauda = e;
		if (cabeca == null) {
			cabeca = cauda;
		}
		e.setProximo(cabeca);
		cabeca.setAnterior(cauda);

	}

	public void addFirst(T valor) throws Exception {
		System.out.println("Adicionando " + valor + " ao inicio da lista.");
		Elemento<T> e = new Elemento<T>(valor);
		if (cabeca != null) {
			cabeca.setAnterior(e);
		}
		e.setProximo(cabeca);
		cabeca = e;
		if (cauda == null) {
			cauda = cabeca;
		}
		e.setAnterior(cauda);

	}

	public T remove() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Lista vazia.");
		}
		T o = cabeca.getValor();

		if (cabeca == cauda) {
			cabeca = cauda = null;
			System.out.println("Removendo o " + o + " do inicio da lista.");
		} else {
			cabeca = cabeca.getProximo();
			System.out.println("Removendo o " + o + " do inicio da lista.");
			cabeca.setAnterior(cauda);
			cauda.setProximo(cabeca);

		}

		return o;
	}

	public T removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Lista vazia.");
		}
		T o = cauda.getValor();

		if (cauda == cabeca) {
			cauda = cabeca = null;
			System.out.println("Removendo o " + o + " do final da lista.");
		} else {
			cauda = cauda.getAnterior();
			System.out.println("Removendo o " + o + " do final da lista.");
			cauda.setProximo(cabeca);
			cabeca.setAnterior(cauda);
		}

		return o;
	}

	public void operacao(Function<T,T> function) {
		Elemento<T> e = cabeca;
		
		while (e != cauda) {
			function.apply(e.getValor());
			e = e.getProximo();
		}
		function.apply(e.getValor());

	}

	public void operacaoEnd(Function<T,T> function) {
		Elemento<T> e = cauda;
		
		while (e != cabeca) {
			function.apply(e.getValor());
			e = e.getAnterior();
		}
		function.apply(e.getValor());
	}

}
