package teste;

import java.util.Scanner;
public class MaiorMenor {
	
	public static void main(String Args[]){
		Scanner entrada = new Scanner(System.in);
		int maior;
		int menor;
		System.out.print("Informe o primeiro n�mero: ");
		maior = entrada.nextInt();
		menor = maior;
		int numero;
		System.out.print("Informe o segundo n�mero: ");
		numero = entrada.nextInt();
		if (numero > maior){
			maior = numero;
		}
		if (numero < menor){
			menor = numero;
		}
		System.out.print("Informe o terceiro n�mero: ");
		numero = entrada.nextInt();
		if (numero > maior){
			maior = numero;
		}
		if (numero < menor){
			menor = numero;
		}
		System.out.println("O maior n�mero � " + maior + ", e o menor � " + menor + "!");
		entrada.close();
	}

}
