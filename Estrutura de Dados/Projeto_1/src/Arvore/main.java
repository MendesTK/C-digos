package Arvore;

public class main {

	public static void main(String[] args) {
		No<Integer> n1 = new No<Integer>(1);
		No<Integer> n2 = new No<Integer>(2);
		No<Integer> n3 = new No<Integer>(3);
		No<Integer> n4 = new No<Integer>(4);
		No<Integer> n5 = new No<Integer>(5);
		No<Integer> n6 = new No<Integer>(6);
		
		n1.filhos.add(n2);
		n1.filhos.add(n5);
		n2.pai = n1;
		n5.pai = n1;
		
		n2.filhos.add(n3);
		n2.filhos.add(n4);
		n3.pai = n2;
		n4.pai = n2;
		
		n5.filhos.add(n6);
		n6.pai = n5;
		
		Arvore<Integer> a = new Arvore<Integer>();
		a.raiz = n1;
		
		a.profundidadeR(n6);

	}

}
