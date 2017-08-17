package teste;
import java.util.Scanner;
import java.util.ArrayList;

public class DescontoDoProduto {
	
	public static void main(String Args[]){
		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> codigoDes = new ArrayList<Double>();
		codigoDes.add((double) 5);
		codigoDes.add((double) 10);
		codigoDes.add((double) 20);
		codigoDes.add((double) 50);
		double valorProd;
		System.out.print("Informe o valor do produto: ");
		valorProd = entrada.nextDouble();
		int codigoEntr;
		System.out.print("Informe o código de desconto do produto: ");
		codigoEntr = entrada.nextInt();
		if (codigoEntr >= 1 && codigoEntr <= 4){
			double aux;
			aux = (100 - codigoDes.get(codigoEntr - 1)) / 100;
			valorProd = aux * valorProd;
			System.out.println("O valor do produto com desconto é R$" + valorProd);
		}
		else{
			System.out.println("Código de desconto incorreto! Tente Novamente!");
		}
		entrada.close();
		
		
	}

}
