package teste;
import java.util.Scanner;

import java.util.ArrayList;
public class DiasDaSemana {
	
	public static void main(String Args[]){
		ArrayList<String> semana = new ArrayList<String>();
		semana.add("Domingo");
		semana.add("Segunda-feira");
		semana.add("Ter�a-feira");
		semana.add("Quarta-feira");
		semana.add("Quinta-feira");
		semana.add("Sexta-feira");
		semana.add("S�bado");
		//System.out.println(semana);
		Scanner codigo = new Scanner(System.in);
		int codigoSem = -1;
		while (codigoSem <= 0 || codigoSem > 7){
			System.out.print("Informe o c�digo do dia da semana: ");
			codigoSem = codigo.nextInt();
			if (codigoSem > 0 && codigoSem <= 7){
				System.out.println("O dia da semana selecionado: " + semana.get(codigoSem - 1));
			}
			else{
				System.out.println("O c�digo da semana informado est� incorreto! Tente novamente.");
			}
		}
		codigo.close();
		
		
	}

}
