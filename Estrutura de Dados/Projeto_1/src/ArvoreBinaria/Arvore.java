package ArvoreBinaria;

public class Arvore<T extends Comparable<T>> {

	public No<T> raiz;

	public void adiciona(T valor) {
		if (this.raiz == null) {
			this.raiz = new No<T>(valor);
		} else {
			this.adiciona(this.raiz, valor);
		}
	}

	private void adiciona(No<T> pai, T valor) {
		if (valor.compareTo(pai.valor) >= 0) {
			if (pai.direita == null) {
				No<T> no = new No<T>(valor);
				no.pai = pai;
				pai.direita = no;
			} else {
				this.adiciona(pai.direita, valor);
			}
		} else {
			if (pai.esquerda == null) {
				No<T> no = new No<T>(valor);
				no.pai = pai;
				pai.esquerda = no;
			} else {
				this.adiciona(pai.esquerda, valor);
			}
		}
	}
}
