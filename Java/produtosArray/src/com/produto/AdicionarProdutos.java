package com.produto;
import java.util.ArrayList;

public class AdicionarProdutos {

	public static void main(String[] args) {
		
		ArrayList<Produto> listaDeProdutos = new ArrayList();
		listaDeProdutos.add(new Produto("Celular", 454));
		listaDeProdutos.add(new Produto("TV", 56465));
		listaDeProdutos.add(new Produto("Vodka", 4645));
		listaDeProdutos.add(new Produto("Cacha�a", 4645));
		listaDeProdutos.add(new Produto("Cocaina", 46546));
		listaDeProdutos.add(new Produto("Veja Multiuso", 455564));
		listaDeProdutos.add(new Produto("Capacete", 44564));
		listaDeProdutos.add(new Produto("Praixteixon", 45544));
		listaDeProdutos.add(new Produto("Monitor", 4454));
		
		for(int i =0; i < listaDeProdutos.size(); i++){
			   System.out.println(listaDeProdutos.get(i));
		   }
		

	}

}
