package ComplexidadeDeAlgoritmo;

public class Complexidade {

	public Complexidade (){
		
	}
	
	public void gerarAleatorio(int n){
		int v[] = new int[n];
		for (int i = 0; i < n; i++){
			int random = (int) Math.floor(Math.random() * n+1); 
			v[i] = random;
			System.out.println(v[i]);
		}
		
	}
	
	
	public int[] minmax1(int v[]) {
		int i;
		int min = v[0];
		int max = v[0];
		for (i = 1; i < v.length; i++) {
			if (v[i] > max) {
				max = v[i];
			}
			if (v[i] < min) {
				min = v[i];
			}
		}
		return new int[] { min, max };
	}

	public int[] minmax2(int[] v) {
		int i;
		int min = v[0];
		int max = v[0];
		for (i = 1; i < v.length; i++) {
			if (v[i] > max) {
				max = v[i];
			} else {
				if (v[i] < min) {
					min = v[i];
				}
			}
		}
		return new int[] { min, max };
	}

	public int[] minmax3(int v[]) {
		int i, a, b;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (i = 0; i < v.length; i += 2) {
			if (v[i] < v[i + 1]) {
				a = i;
				b = i + 1;
			} else {
				a = i + 1;
				b = i;
			}
			if (v[a] < min) {
				min = v[a];
			}
			if (v[b] > max) {
				max = v[b];
			}
		}
		return new int[] { min, max };
	}

}
