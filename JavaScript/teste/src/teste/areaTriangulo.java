package teste;
import java.util.Scanner;

public class areaTriangulo {
	
	public static void main(String Args[]){
		Scanner triangulo = new Scanner(System.in);
		System.out.print("Infome o tamanho da base: ");
		int base = triangulo.nextInt();
		System.out.print("Informe o tamanho da altura: ");
		int altura = triangulo.nextInt();
		int area = (base * altura)/ 2;
		
		System.out.println("A área do triangulo é: " + area);
		triangulo.close();
	}
	
	

}