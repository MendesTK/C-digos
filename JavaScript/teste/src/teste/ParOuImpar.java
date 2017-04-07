package teste;
import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String Args[]){
		Scanner ParOuImpar = new Scanner (System.in);
		System.out.print("Informe o número: ");
		int numero = ParOuImpar.nextInt();
		if ((numero % 2) == 0){
			System.out.println("O número é par!");
		}
		else if ((numero % 2) != 0){
			System.out.println("O número é impar.");
		}
		ParOuImpar.close();
	}

}