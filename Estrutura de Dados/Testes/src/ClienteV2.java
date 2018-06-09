

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClienteV2 extends Thread {
    // parte que controla a recepcao de mensagens do ClienteV2
    private Socket con;
    // construtor que recebe o socket do ClienteV2
    public ClienteV2(Socket socket) {
        this.con = socket;
    }
    public static void main(String args[])
    {
        try {
            //Instancia do atributo con do tipo Socket, conecta a IP do Servidor, Porta
            Socket socket = new Socket("127.0.0.1", 8080);
            //Instancia do atributo saida, obtem os objetos que permitem controlar o fluxo de comunicacao
            PrintStream saida = new PrintStream(socket.getOutputStream());
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Digite seu nome: ");
            String meuNome = teclado.readLine();
            //envia o nome digitado para o servidor
            saida.println(meuNome.toUpperCase());
            //instancia a thread para ip e porta conectados e depois inicia ela
            Thread thread = new ClienteV2(socket);
            thread.start();
            //Cria a variavel msg responsavel por enviar a mensagem para o servidor
            String msg;
            while (true)
            {
                // cria linha para digitacao da mensagem e a armazena na variavel msg
                System.out.print("Mensagem > ");
                msg = teclado.readLine();
                // envia a mensagem para o servidor
                saida.println(msg);
            }
        } catch (IOException e) {
            System.out.println("Falha na con... .. ." + " IOException: " + e);
        }
    }
    // execu��o da thread
    public void run()
    {
        try {
            //recebe mensagens de outro ClienteV2 atraves do servidor
            BufferedReader entrada = new BufferedReader(new InputStreamReader(this.con.getInputStream()));
            //cria variavel de mensagem
            String msg;
            while (true)
            {
                // pega o que o servidor enviou
                msg = entrada.readLine();
                //se a mensagem contiver dados, passa pelo if, caso contrario cai no break e encerra a con
                if (msg == null) {
                    System.out.println("con encerrada!");
                    System.exit(0);
                }
                System.out.println();
                //imprime a mensagem recebida
                System.out.println(msg);
                //cria uma linha visual para resposta
                System.out.print("Responder > ");
            }
        } catch (IOException e) {
            // caso ocorra alguma excecao de E/S, mostra qual foi.
            System.out.println("Ocorreu uma Falha... .. ." + " IOException: " + e);
        }
    }
}