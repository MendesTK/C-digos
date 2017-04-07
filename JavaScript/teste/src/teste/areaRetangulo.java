package teste;
import java.util.Scanner;

public class areaRetangulo {
	
	public static void main(String Args[]){
		Scanner retangulo = new Scanner(System.in);
		System.out.print("Informe o tamanho do lado A: ");
		int a = retangulo.nextInt();
		System.out.print("Informe o tamanho de B: ");
		int b = retangulo.nextInt();
		int area = a * b;
		
		System.out.println("A área do retangulo é " + area);
		retangulo.close();
		
	}
	
}