import java.util.ArrayList;

public class UsarColecao {

	public static void main(String[] args) {
		//cole��o de String
		ArrayList<String> lista = new ArrayList<>();
		//metodo size() retorna o tamanho da lista
		System.out.println("Tamanho da lista "+lista.size());
		//m�todo add(umObjeto) adiciona objetos na lista
		lista.add("Cacha�a");
		lista.add("Vodka");
		lista.add("Pinga");
		System.out.println("Tamanho da lista "+lista.size());
		//m�todo get(index) pega um item
		System.out.println("Item da posi��o 1 "+lista.get(1));
		//m�todo remove(objeto) remove um objeto
		lista.remove(1);
		System.out.println("Item da posi��o 1 "+lista.get(1));
		
		
		

	}

}
