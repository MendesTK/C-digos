package ComplexidadeDeAlgoritmo;

public class OrdenadorDeVetores {

	public OrdenadorDeVetores() {

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

	public int minmax1(int v[]) {
		int i;
		int cont1 = 0;
		int min = v[0];
		int max = v[0];
		for (i = 1; i < v.length; i++) {
			cont1 += 1;
			if (v[i] > max) {
				max = v[i];
			}
			cont1 += 1;
			if (v[i] < min) {
				min = v[i];
			}

		}
		// System.out.println("1: Min: " + min + " | Max: " + max);
		// return new int[] { min, max };
		return cont1;
	}

	public int minmax2(int[] v) {
		int i;
		int cont2 = 0;
		int min = v[0];
		int max = v[0];
		for (i = 1; i < v.length; i++) {
			cont2 += 1;
			if (v[i] > max) {
				max = v[i];
			} else {
				cont2 += 1;
				if (v[i] < min) {
					min = v[i];
				}
			}
		}
		// System.out.println("2: Min: " + min + " | Max: " + max);
		// return new int[] { min, max };
		return cont2;
	}

	public int minmax3(int v[]) {
		int i, a, b;
		int cont3 = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int dif = v.length % 2 == 0 ? 0 : 1;
		for (i = 0; i < v.length - dif; i += 2) {
			cont3 += 1;
			if (v[i] < v[i + 1]) {
				a = i;
				b = i + 1;
			} else {
				a = i + 1;
				b = i;
			}
			cont3 += 1;
			if (v[a] < min) {
				min = v[a];
			}
			cont3 += 1;
			if (v[b] > max) {
				max = v[b];
			}
		}
		cont3 += 1;
		if (dif == 1) {
			cont3 += 1;
			if (v[v.length - 1] > max) {
				max = v[v.length - 1];
			}
			cont3 += 1;
			if (v[v.length - 1] < min) {
				min = v[v.length - 1];
			}
		}
		// System.out.println("3: Min: " + min + " | Max: " + max);
		// return new int[] { min, max };
		return cont3;
	}

	public int[] selectionSort(int v[]) {
		int min = 0;
		int operacoes = 0;
		// int i = 0;

		for (int i = 0; i < v.length - 1; i++) {
			min = i;

			for (int j = i + 1; j < v.length; j++) {
				operacoes += 1;
				if (v[j] < v[min]) {
					min = j;
				}
			}

			if (v[i] != v[min]) {
				int aux = v[i];
				v[i] = v[min];
				v[min] = aux;
			}

		}

		return v;
	}

	public int[] bubbleSort(int v[]) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (v[i] > v[j]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}

		return v;
	}

}
