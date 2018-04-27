package PilhaEstatica;

public class main {
	
	public static void main (String[] args) throws Exception{
		PilhaEstatica pilha = new PilhaEstatica(5);
		
		pilha.push(5);
		pilha.push(2);
		pilha.push(3);
		
		pilha.pop();
		pilha.pop();
		pilha.pop();
		
	}

}
