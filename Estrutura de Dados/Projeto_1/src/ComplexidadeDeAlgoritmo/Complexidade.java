package ComplexidadeDeAlgoritmo;

public class Complexidade {

	public int[] minmax3(int v[]){
		int i,a,b;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (i = 0; i < v.length; i += 2){
			if(v[i] < v[i + 1]){
				a = i; b = i + 1;
				
			}else{
				a = i + 1; b = 1;
			}
			if (v[a] < min){
				
			}
		}
		
		
		
		return v;
		
	}
	
}
