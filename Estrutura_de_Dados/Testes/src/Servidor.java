import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Servidor extends Thread {
    private static Map<String, PrintStream> MAP_CLIENTES;
    private Socket con;
    private String nomeCliente;
    private static List<String> LISTA_DE_NOMES = new ArrayList<String>();

    public Servidor(Socket socket) {
        this.con = socket;
    }

    public boolean guardaNome(String newName) {
        for (int i = 0; i < LISTA_DE_NOMES.size(); i++) {
            if (LISTA_DE_NOMES.get(i).equals(newName))
                return true;
        }
        LISTA_DE_NOMES.add(newName);
        return false;
    }

    public void remove(String oldName) {
        for (int i = 0; i < LISTA_DE_NOMES.size(); i++) {
            if (LISTA_DE_NOMES.get(i).equals(oldName))
                LISTA_DE_NOMES.remove(oldName);
        }
    }


    public void run() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(this.con.getInputStream()));
            PrintStream saida = new PrintStream(this.con.getOutputStream());
            this.nomeCliente = entrada.readLine();
            if (guardaNome(this.nomeCliente)) {
                saida.println("Nick name já existe, tente novamente!");
                this.con.close();
                return;
            } else {
                //mostra o nome do cliente conectado ao servidor
                System.out.println(this.nomeCliente + " : Conectado ao Servidor!");

                String s = "";
                for (String aux : LISTA_DE_NOMES) {
                    if (!aux.equalsIgnoreCase(this.nomeCliente)) {
                        s = s + aux + " ";
                    }
                }
                //Quando o cliente se conectar recebe todos que estao conectados
                saida.println("Conectados: " + s);

                //envia lista para todos assim que qualquer cliente se conecta
                sendListToAll(this.nomeCliente);
            }

            if (this.nomeCliente == null) {
                return;
            }

            MAP_CLIENTES.put(this.nomeCliente, saida);

            String[] msg = entrada.readLine().split(":");
            while (msg != null && !(msg[0].trim().equals(""))) {
                sendToAll(saida, " escreveu: ", msg);
                msg = entrada.readLine().split(":");
            }
            System.out.println(this.nomeCliente + " saiu do bate-papo!");
            String[] out = {" do bate-papo!"};
            sendToAll(saida, " saiu", out);
            remove(this.nomeCliente);

            MAP_CLIENTES.remove(this.nomeCliente);

            this.con.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void sendToAll(PrintStream saida, String acao, String[] msg) {
        out:
        for (Map.Entry<String, PrintStream> cliente : MAP_CLIENTES.entrySet()) {
            PrintStream chat = cliente.getValue();
            if (chat != saida) {
                if (msg.length == 1) {
                    chat.println(this.nomeCliente + acao + msg[0]);
                } else {
                    if (msg[1].equalsIgnoreCase(cliente.getKey())) {
                        chat.println(this.nomeCliente + acao + msg[0]);
                        break out;
                    }
                }
            }
        }
    }

    public void sendListToAll(String nome) {
        for (Map.Entry<String, PrintStream> cliente : MAP_CLIENTES.entrySet()) {
            if (!cliente.getKey().equalsIgnoreCase(nome)) {
                String aux = "";
                for (String s : LISTA_DE_NOMES) {
                    if (!s.equalsIgnoreCase(cliente.getKey())) {
                        aux = aux + s + " ";
                    }
                }
                PrintStream chat = cliente.getValue();
                chat.println("[" + aux + "]");
                chat.flush();
            }
        }
    }
    
    
    
    public static void main(String args[]) {
        MAP_CLIENTES = new HashMap<String, PrintStream>();
        try {
            ServerSocket server = new ServerSocket(2222);
            System.out.println("Servidor rodando na porta 2222");
            while (true) {
                Socket con = server.accept();
                Thread t = new Servidor(con);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}