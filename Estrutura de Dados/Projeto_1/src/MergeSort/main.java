package MergeSort;

public class main {
	public static void main(String[] args) {
		MergeSort vetor = new MergeSort();

		/*
		 * 
		 * int[] v = vetor.gerarAleatorio(1001); int[] w = new int[v.length];
		 * 
		 * 
		 * int total = vetor.mergeSort(v, w, 0, v.length - 1);
		 * 
		 * 
		 * for(int i = 0; i < v.length; i++){ System.out.println(v[i]); }
		 * 
		 * System.out.println(": " +total);
		 */

		int n = 1000;
		for (int i = 1; i <= n; i++) {
			int a[] = vetor.gerarAleatorio(i);
			int c[] = vetor.gerarCrescente(i);
			int d[] = vetor.gerarDecrescente(i);

			int a2[] = a;
			int c2[] = c;
			int d2[] = d;

			int a3[] = a;
			int c3[] = c;
			int d3[] = d;

			int a4[] = a;
			int c4[] = c;
			int d4[] = d;

			int[] w1 = new int[a.length];
			int[] w2 = new int[c.length];
			int[] w3 = new int[d.length];

			int n1 = vetor.mergeSort(a, w1, 0, a.length - 1);
			int n2 = vetor.mergeSort(c, w2, 0, c.length - 1);
			int n3 = vetor.mergeSort(d, w3, 0, d.length - 1);

			int n4 = vetor.selectionSort(a2);
			int n5 = vetor.selectionSort(c2);
			int n6 = vetor.selectionSort(d2);

			int n7 = vetor.bubbleSort(a3);
			int n8 = vetor.bubbleSort(c3);
			int n9 = vetor.bubbleSort(d3);

			int n10 = vetor.insertionSort(a4);
			int n11 = vetor.insertionSort(c4);
			int n12 = vetor.insertionSort(d4);

			System.out.println(i + ";" + n1 + ";" + n2 + ";" + n3 + ";" + n4 + ";" + n5 + ";" + n6 + ";" + n7 + ";" + n8
					+ ";" + n9 + ";" + n10 + ";" + n11 + ";" + n12);
		}

	}
}
