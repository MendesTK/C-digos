package MergeSort;

public class MergeSort {

	private int mergeCount;

	public MergeSort() {

	}

	public int[] gerarCrescente(int n) {
		int v[] = new int[n];
		int aux = 1;
		for (int i = 0; i < n; i++) {
			v[i] = aux;
			aux += 1;
			// System.out.println(v[i]);
		}
		return v;
	}

	public int[] gerarDecrescente(int n) {
		int v[] = new int[n];
		int aux = n;
		for (int i = 0; i < n; i++) {
			v[i] = aux;
			aux -= 1;
			// System.out.println(v[i]);
		}
		return v;
	}

	public int[] gerarAleatorio(int n) {
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			int random = (int) Math.floor(Math.random() * n + 1);
			v[i] = random;
			// System.out.println(v[i]);
		}
		return v;

	}

	public int mergeSort(int[] v, int[] w, int ini, int fim) {
		mergeCount = 0;
		
		mergeCount += 1;
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(v, w, ini, meio);
			mergeSort(v, w, meio + 1, fim);
			intercalar(v, w, ini, meio, fim);

		}
		return mergeCount;
	}

	private void intercalar(int[] v, int[] w, int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++)
			w[k] = v[k];

		int i = ini;
		int j = meio + 1;

		for (int k = ini; k <= fim; k++) {
			mergeCount += 1;
			if (i > meio) {
				v[k] = w[j++];
			} else if (j > fim) {
				v[k] = w[i++];
				mergeCount += 1;
			} else if (w[i] < w[j]) {
				v[k] = w[i++];
				mergeCount += 2;
			} else {
				v[k] = w[j++];
				mergeCount += 2;
			}

		}

	}

	public int selectionSort(int v[]) {
		int min = 0;
		int count = 0;
		

		for (int i = 0; i < v.length - 1; i++) {
			min = i;

			for (int j = i + 1; j < v.length; j++) {
				count += 1;
				if (v[j] < v[min]) {
					min = j;
				}
			}
			count += 1;
			if (v[i] != v[min]) {
				int aux = v[i];
				v[i] = v[min];
				v[min] = aux;
			}

		}

		return count;
	}

	public int bubbleSort(int v[]) {
		int count = 0;
		
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = i + 1; j < v.length; j++) {
				count += 1;
				if (v[i] > v[j]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}

		return count;
	}

	public int bubbleSort2(int v[]) {
		int count = 0;
		boolean troca;

		do {
			troca = false;
			for (int i = 0; i < v.length - 1; i++) {
				count += 1;
				if (v[i] > v[i + 1]) {
					int aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
					troca = true;
				}
			}
		} while (troca);
		return count;
	}

	public int insertionSort(int v[]) {
		int count = 0;
		for (int i = 1; i < v.length; i++) {
			int pivo = v[i];
			int j = i - 1;
			
			count += 1;
			while (j >= 0 && pivo < v[j]) {
				v[j + 1] = v[j];
				j--;
			}
			v[j + 1] = pivo;
		}

		return count;
	}

}
