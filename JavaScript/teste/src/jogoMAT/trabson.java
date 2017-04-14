package jogoMAT;

import java.util.Scanner;



public class trabson {
	
	public static void main(String[] Args){
		Scanner entrada = new Scanner(System.in);
		int aux = 0, dificuldade = 1;
		while (aux != 3){
			System.out.println("   Jogo de Matemática");
			System.out.println("************************");
			System.out.println("* 1 - Novo Jogo        *");
			System.out.println("* 2 - Dificuldade      *");
			System.out.println("* 3 - Sair             *");
			System.out.println("************************");
			int pontuacao = 0; // Armazenar a pontuação
			int tentativas = 5;
			System.out.print(": ");
			aux = entrada.nextInt();
			if (aux == 2){ // If para a escolha de dificuldade
				System.out.println("*********************************");
				System.out.println("* Dificuldade *   Expressões    *");
				System.out.println("*=============*=================*");
				System.out.println("*      1      *     + | -       *");
				System.out.println("*      2      *     . (*)       *");
				System.out.println("*      3      *       /         *");
				System.out.println("*      4      *  + | - | . | /  *");
				System.out.println("*********************************");
				System.out.print(": ");
				dificuldade = entrada.nextInt();
				System.out.println("Dificuldade escolhida. Bom jogo!");
			}
			if (aux == 1){ //Novo jogo (Se não for escolhido a dificuldade antes, ela começara em 1
				int random1, random2, resposta;
				while (tentativas > 0){
					if (dificuldade == 1){ //Soma e Subtração
						int soma, subtracao, random;
						for (int i = 0; i < 9; i++){
							random = (int) Math.floor(Math.random() * 10);
							if (random < 5){ //parte da soma
								random1 = (int) Math.floor(Math.random() * 10); 
								random2 = (int) Math.floor(Math.random() * 10);
								soma = random1 + random2;
								System.out.println(random1 + " + " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (soma == resposta){
									pontuacao += 1;
									System.out.println("Parabéns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta! A resposta correta era: "+ soma);
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontuação total é: " + pontuacao);
										dificuldade = 1;
										break;
									}
								}
							}
							else if (random >= 5){ //parte da subtracão
								random1 = (int) Math.floor(Math.random() * 10); 
								random2 = (int) Math.floor(Math.random() * 10);
								subtracao = random1 - random2;
								System.out.println(random1 + " - " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (subtracao == resposta){
									pontuacao += 1;
									System.out.println("Parabéns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta! A resposta correta era: "+ subtracao);
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontuação total é: " + pontuacao);
										dificuldade = 1;
										break;
									}
								}
							}
						}
						if (tentativas > 0){
							System.out.println("Dificuldade concluida. Sua pontuação total é: " + pontuacao);
							dificuldade +=1;
						}
					}
				
					else if (dificuldade == 2){ //multiplicação
						int multiplicacao;
						for (int i = 0; i < 9; i++){
							random1 = (int) Math.floor(Math.random() * 10); 
							random2 = (int) Math.floor(Math.random() * 10);
							multiplicacao = random1 * random2;
							System.out.println(random1 + " * " + random2 + " = ?");
							System.out.print("Sua resposta: ");
							resposta = entrada.nextInt();
							if (multiplicacao == resposta){
								pontuacao += 1;
								System.out.println("Parabéns vc acertou!");
							}
							else{
								tentativas -= 1;
								System.out.println("Resposta incorreta! A resposta correta era: "+ multiplicacao);
								System.out.println("Restam " + tentativas + " vidas!");
								if (tentativas == 0){
									System.out.println("Sua pontuação total é: " + pontuacao);
									dificuldade = 1;
									break;
								}
							}
						}
						if (tentativas > 0){
							System.out.println("Dificuldade concluida. Sua pontuação total é: " + pontuacao);
							dificuldade +=1;
						}
					}
					else if (dificuldade == 3){ //divisão
						double divisao;
						for (int i = 0; i < 9; i++){
							double rap1, rap2, resp, dado;
							rap1 = (double) Math.floor(Math.random() * 10); 
							rap2 = (double) Math.floor(Math.random() * 9+1);
							divisao = (double) (rap1 / rap2);
							System.out.println(rap1 + " / " + rap2 + " = ?");
							System.out.print("Sua resposta: ");
							resp = entrada.nextDouble();
							dado = Math.round(divisao*10)/10D;
							if (dado == resp){
								pontuacao += 1;
								System.out.println("Parabéns vc acertou!");
							}
							else{
								tentativas -= 1;
								System.out.println("Resposta incorreta! A resposta correta era: "+ dado);
								System.out.println("Restam " + tentativas + " vidas!");
								if (tentativas == 0){
									System.out.println("Sua pontuação total é: " + pontuacao);
									dificuldade = 1;
									break;
								}
							}
						}
						if (tentativas > 0){
							System.out.println("Dificuldade concluida. Sua pontuação total é: " + pontuacao);
							dificuldade +=1;
						}
					}
					else if (dificuldade == 4){ // ultima dificuldade, misto de todos os outros
						int soma, subtracao, multiplicacao, random;
						for (int i = 0; i < 9; i++){
							random = (int) Math.floor(Math.random() * 41);
							if (random <= 10){ //soma
								random1 = (int) Math.floor(Math.random() * 100); 
								random2 = (int) Math.floor(Math.random() * 100);
								soma = random1 + random2;
								System.out.println(random1 + " + " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (soma == resposta){
									pontuacao += 1;
									System.out.println("Parabéns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta! A resposta correta era: "+ soma);
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontuação total é: " + pontuacao);
										dificuldade = 1;
										break;
									}
								}
							}
							else if (random > 10 && random <= 20){ //subtração
								random1 = (int) Math.floor(Math.random() * 100); 
								random2 = (int) Math.floor(Math.random() * 100);
								subtracao = random1 - random2;
								System.out.println(random1 + " - " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (subtracao == resposta){
									pontuacao += 1;
									System.out.println("Parabéns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta! A resposta correta é: "+ subtracao);
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontuação total é: " + pontuacao);
										dificuldade = 1;
										break;
									}
								}
							}
							else if (random > 20 && random <= 30){ //multiplicação
								random1 = (int) Math.floor(Math.random() * 100); 
								random2 = (int) Math.floor(Math.random() * 100);
								multiplicacao = random1 * random2;
								System.out.println(random1 + " * " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (multiplicacao == resposta){
									pontuacao += 1;
									System.out.println("Parabéns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta! A resposta correta era: "+ multiplicacao);
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontuação total é: " + pontuacao);
										dificuldade = 1;
										break;
									}
								}
							}
							else if (random > 30 && random <= 40){ //divisão
								double rap1, rap2, resp, dado, div;
								rap1 = (double) Math.floor(Math.random() * 100); 
								rap2 = (double) Math.floor(Math.random() * 99+1);
								div = (double) (rap1 / rap2);
								System.out.println(rap1 + " / " + rap2 + " = ?");
								System.out.print("Sua resposta: ");
								resp = entrada.nextDouble();
								dado = Math.round(div*10)/10D;
								if (dado == resp){
									pontuacao += 1;
									System.out.println("Parabéns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta! A resposta correta era: "+ dado);
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontuação total é: " + pontuacao);
										dificuldade = 1;
										break;
									
									}
								}
							}
						}
						if (tentativas > 0){
							System.out.println("Dificuldade concluida. Sua pontuação total é: " + pontuacao);
							System.out.println("Parabéns, você completou o game!");
						}
					}
				}
			}
			else if (aux == 3){
				System.out.print("Saiu com sucesso!");
			}
		}
		entrada.close();
	}

}