package teste;
import java.util.Scanner;

public class IntervaloDeTempo {
	
	public static void main(String Args[]){
		Scanner entrada = new Scanner(System.in);
		long horas_seg = 3600;
		long tempo, horas, minutos, segundos;
		System.out.print("Forneça o intervalo de tempo em segundos: ");
		tempo = entrada.nextLong();
		horas = (tempo / horas_seg);
		minutos = (tempo - (horas_seg * horas)) / 60;
		segundos = (tempo - (horas_seg * horas) - (minutos * 60));
		System.out.println("O intervalo de tempo correspondente é "+ horas + "h " + minutos + "min " + segundos + "seg.");
		
		
		entrada.close();
	}

}
