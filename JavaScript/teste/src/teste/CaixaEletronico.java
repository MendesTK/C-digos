package teste;
import java.util.Scanner;

public class CaixaEletronico {
	
	public static void main(String Args[]){
		Scanner banco = new Scanner(System.in);
		System.out.println("Bem vindo ao banco Java");
		int operacao = 0;
		double saldo = 0;
		while (operacao != 4) {
			System.out.print("Informe a operação desejada: "
					+ " 1 para Consultar o saldo."
					+ " 2 para efetuar deposito."
					+ " 3 para efetuar saque."
					+ " 4 para encerrar");
			operacao = banco.nextInt();
			if (operacao == 1){
				System.out.println("O seu saldo é de R$" + saldo);
			}
			else if (operacao == 2){
				System.out.print("Informe o valor de deposito: ");
				saldo += banco.nextDouble();
				System.out.println("Deposito realizado com sucesso! O seu saldo atual é de R$" + saldo + "!");
			}
			else if (operacao == 3){
				System.out.print("Informe o valor para saque: ");
				saldo -= banco.nextDouble();
				System.out.println("Saque realizado com sucesso! O seu saldo atual é de R$" + saldo + "!");
			}
			else if (operacao == 4){
				System.out.println("Banco java agradece a sua preferencia!");
			}
		}
		banco.close();
	}

}