package teste;
import java.util.Scanner;

public class ConversaoTemperatura {
	
	public static void main(String Args[]){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe C para converter Celsius para Fahrenheit!");
		System.out.println("Informe F para converter Fahrenheit para Celsius!");
		char escolha;
		System.out.print("Qual a conversão desejada? ");
		escolha = entrada.nextLine().charAt(0);
		System.out.println(escolha);
		double CelsiusToFahrenheit;
		double FahrenheitToCelsius;
		if (escolha == 'f' || escolha == 'F'){
			System.out.print("Informe a temperatura em Fahrenheit: ");
			FahrenheitToCelsius = entrada.nextDouble();
			double conversaoF = ((FahrenheitToCelsius - 32) * 5 ) / 9;
			System.out.println("A temperatura em Celsius é: " + conversaoF + " graus Celsius!");
		}
		else if (escolha == 'c' || escolha == 'C'){
			System.out.print("Informe a temperatura em Celsius: ");
			CelsiusToFahrenheit = entrada.nextDouble();
			double conversaoC = ((CelsiusToFahrenheit * 9) / 5) + 32;
			System.out.println("A temperatura em Fahrenheit é: " + conversaoC + " Fahrenheit!");
		}
		else{
			System.out.println("Opção inválida! Tente Novamente!");
		}
		entrada.close();
		
	}

}
