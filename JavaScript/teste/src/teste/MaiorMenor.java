package teste;

import java.util.Scanner;
public class MaiorMenor {
	
	public static void main(String Args[]){
		Scanner entrada = new Scanner(System.in);
		int maior;
		int menor;
		System.out.print("Informe o primeiro número: ");
		maior = entrada.nextInt();
		menor = maior;
		int numero;
		System.out.print("Informe o segundo número: ");
		numero = entrada.nextInt();
		if (numero > maior){
			maior = numero;
		}
		if (numero < menor){
			menor = numero;
		}
		System.out.print("Informe o terceiro número: ");
		numero = entrada.nextInt();
		if (numero > maior){
			maior = numero;
		}
		if (numero < menor){
			menor = numero;
		}
		System.out.println("O maior número é " + maior + ", e o menor é " + menor + "!");
		entrada.close();
	}

}
