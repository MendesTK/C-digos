package Arvore;

import java.util.Stack;

public class Arvore<T> {
	
	public No<T> raiz;
	
	public void profundidadeR(No<T> no) {
		System.out.println(no.valor);
		
		for (No<T> filho : no.filhos){
			this.profundidadeR(filho);
		}
		
	}
	
	public void profundidadeNR(No<T> no){
		Stack<No<T>> pilha = new Stack<No<T>>();
		pilha.push(no);
		
		while (!pilha.isEmpty()) {
			no = pilha.pop();
			System.out.println(no.valor);
			
			for (int i = no.filhos.size() - 1; i >= 0; i--){
				pilha.push(no.filhos.get(i));
			}
		}
	}
	
	public void largura(No<T> no){
		
	}
		
}
