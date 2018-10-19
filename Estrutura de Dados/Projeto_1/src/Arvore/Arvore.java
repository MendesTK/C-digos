package Arvore;

public class Arvore<T> {
	
	public No<T> raiz;
	
	public void profundidadeR(No<T> no) {
		System.out.println(no.valor);
		
		for (No<T> filho : no.filhos){
			this.profundidadeR(filho);
		}
		
	}
		
}
