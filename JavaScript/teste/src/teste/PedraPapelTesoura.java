package teste;
import java.util.Scanner;

public class PedraPapelTesoura {
	
	public static void main(String Args[]){
		Scanner entrada = new Scanner(System.in);
		char jogadorA;
		char jogadorB;
		System.out.println("Informe R para pedra.");
		System.out.println("Informe P para papel.");
		System.out.println("Informe T para tesoura.");
		System.out.print("Informe a jogada do jogador A: ");
		jogadorA = entrada.nextLine().charAt(0);
		System.out.print("Informe a jogada do jogador B: ");
		jogadorB = entrada.nextLine().charAt(0);
		if ((jogadorA == 'R' || jogadorA == 'r') && (jogadorB == 'T' || jogadorB == 't')){
			System.out.println("O jogador A venceu!");
		}
		else if ((jogadorB == 'R' || jogadorB == 'r') && (jogadorA == 'T' || jogadorA == 't')){
			System.out.println("O jogador B venceu!");
		}
		else if ((jogadorA == 'T' || jogadorA == 't') && (jogadorB == 'P' || jogadorB == 'p')){
			System.out.println("O jogador A venceu!");
		}
		else if ((jogadorB == 'T' || jogadorB == 't') && (jogadorA == 'P' || jogadorA == 'p')){
			System.out.println("O jogador B venceu!");
		}
		else if ((jogadorA == 'P' || jogadorA == 'p') && (jogadorB == 'R' || jogadorB == 'r')){
			System.out.println("O jogador A venceu!");
		}
		else if ((jogadorB == 'P' || jogadorB == 'p') && (jogadorA == 'R' || jogadorA == 'r')){
			System.out.println("O jogador B venceu!");
		}
		else{
			System.out.println("Empate");
		}
		entrada.close();
		
	}

}
