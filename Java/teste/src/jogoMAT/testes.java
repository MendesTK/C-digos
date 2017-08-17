package jogoMAT;

import java.util.Scanner;


public class testes {

	public static void main(String args[]){
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
		do{
			System.out.println("|================|");
			System.out.println("|     OPCOES     |");
			System.out.println("|================|");
			System.out.println("| 1 - Repetir    |");
			System.out.println("| 2 - Sair       |");
			System.out.println("|================|");
			opcao = leitor.nextInt();
		}while(opcao != 2);
		System.out.println("Fim do programa.");
	}
	
}
