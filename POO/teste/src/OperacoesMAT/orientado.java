package OperacoesMAT;

public class orientado {
	public float somar(float n1, float n2){
		return n1 + n2;
	}
	
	public float subtrair(float n1, float n2){
		return n1+(-n2);
	}
	
	public float multiplicacao(float n1, float n2){
		float soma = 0;
		boolean negativo = false;
		
		if ( (n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0) ){
			negativo = true;
		}
		
		if ( n1 < 0 ){
			n1 = this.subtrair(0f,n1);
		}
		
		if ( n2 < 0 ){
			n2 = this.subtrair(0f,n2);
		}
		
		float i;
		
		for ( i=0;i<(int)n2;i = this.somar(i, 1) ){
			soma = this.somar(soma,n1);
		}
		
		n2 = this.subtrair(i,n2);
		if ( n2 < 0 ){
			n2 = this.subtrair(0f,n2);
		}
		
		if ( n2 != 0 ){
			for ( i=0;i<n2;i = this.somar(i, 0.1f) ){
				soma = this.somar(soma,this.divisao(n1, 10f));
			}
			
			n2 = this.subtrair(i,n2);
			if ( n2 < 0 ){
				n2 = this.subtrair(0f,n2);
			}
			
			
			if ( n2 != 0 ){
				for ( i=0;i<n2;i = this.somar(i, 0.01f) ){
					soma = this.somar(soma,this.divisao(n1, 100f));
				}
				
				n2 = this.subtrair(i,n2);
				if ( n2 < 0 ){
					n2 = this.subtrair(0f,n2);
				}
				
				if ( n2 != 0 ){
					for ( i=0;i<(int)n2;i = this.somar(i, 0.001f) ){
						soma = this.somar(soma,this.divisao(n1, 1000f));
					}
				}
			}
		}
		
		if ( negativo ){
			soma = this.subtrair(0f,soma);
		}
		
		return soma;
	}
	public float divisao(float n1, float n2){
		float cont = 0;
		boolean negativo = false;
		
		if ( (n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0) ){
			negativo = true;
		}
		
		if ( n1 < 0 ){
			n1 = this.subtrair(0f,n1);
		}
		
		if ( n2 < 0 ){
			n2 = this.subtrair(0f,n2);
		}
		
		while (n1 >= n2){
			n1 = this.subtrair(n1, n2);
			cont = this.somar(cont, 1);
		}
		
		if ( n1 > 0 ){
			n1 = this.multiplicacao(n1, 10);
			while (n1 >= n2){
				n1 = this.subtrair(n1, n2);
				cont = this.somar(cont, 0.1f);
			}
		}
		
		if ( n1 > 0 ){
			n1 = this.multiplicacao(n1, 10);
			while (n1 >= n2){
				n1 = this.subtrair(n1, n2);
				cont = this.somar(cont, 0.01f);
			}
		}
		
		if ( n1 > 0 ){
			n1 = this.multiplicacao(n1, 10);
			while (n1 >= n2){
				n1 = this.subtrair(n1, n2);
				cont = this.somar(cont, 0.001f);
			}
		}
		
		if ( negativo ){
			cont = this.subtrair(0f,cont);
		}
			
		return cont;
	}
	public float potencia(float n1, float n2){
		float soma = n1;
		
		if ( n2 != 0 ){
			for ( float i=1;i<n2;i = this.somar(i, 1) ){
				soma = this.multiplicacao(soma,n1);
			}
		} else {
			soma = 1;
		}
		
		return soma;
	}
	
}
