package teste;
import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String Args[]){
		Scanner ParOuImpar = new Scanner (System.in);
		System.out.print("Informe o n�mero: ");
		int numero = ParOuImpar.nextInt();
		if ((numero % 2) == 0){
			System.out.println("O n�mero � par!");
		}
		else if ((numero % 2) != 0){
			System.out.println("O n�mero � impar.");
		}
		ParOuImpar.close();
	}

}