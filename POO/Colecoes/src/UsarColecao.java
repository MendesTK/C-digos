import java.util.ArrayList;

public class UsarColecao {

	public static void main(String[] args) {
		//coleção de String
		ArrayList<String> lista = new ArrayList<>();
		//metodo size() retorna o tamanho da lista
		System.out.println("Tamanho da lista "+lista.size());
		//método add(umObjeto) adiciona objetos na lista
		lista.add("Cachaça");
		lista.add("Vodka");
		lista.add("Pinga");
		System.out.println("Tamanho da lista "+lista.size());
		//método get(index) pega um item
		System.out.println("Item da posição 1 "+lista.get(1));
		//método remove(objeto) remove um objeto
		lista.remove(1);
		System.out.println("Item da posição 1 "+lista.get(1));
		
		
		

	}

}
