package ComplexidadeDeAlgoritmo;

public class main {

	public static void main(String[] args) {
		OrdenadorDeVetores vetor = new OrdenadorDeVetores();
		/*int n = 1000;

		for (int i = 1; i <= n; i++) {
			int a[] = vetor.gerarAleatorio(i);
			int c[] = vetor.gerarCrescente(i);
			int d[] = vetor.gerarDecrescente(i);

			int n1 = vetor.minmax1(c);
			int n2 = vetor.minmax2(c);
			int n3 = vetor.minmax2(d);
			int n4 = vetor.minmax2(a);
			int n5 = vetor.minmax3(c);

			System.out.println(i + ";" + n1 + ";" + n2 + ";" + n3 + ";" + n4 + ";" + n5);
		}

		// System.out.println(": " + vetorGerado[0]);*/
		
		int v[] = {12, 8, 9, 3};
		//vetor.selectionSort(v);
		vetor.bubbleSort(v);
		
		for(int i = 0; i < v.length; i++){
			System.out.println(v[i]);
		}

	}

}
