package ArvoreBinaria;

import java.util.ArrayList;
import java.util.List;


public class No<T extends Comparable<T>> {

	public No<T> pai;
	public No<T> esquerda;
	public No<T> direita;
	public T valor;

	public List<No<T>> filhos = new ArrayList<No<T>>();

	public No(T v) {
		valor = v;
	}

}
