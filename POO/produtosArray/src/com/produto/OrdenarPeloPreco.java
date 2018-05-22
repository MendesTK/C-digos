package com.produto;
import java.util.List;

public class OrdenarPeloPreco implements Ordenacao {
	
	public List<Produto> ordenarCrescente(List<Produto> lista) {
		Produto aux;
		
		for (int i = 0; i < lista.size() - 1; i++){
			
			for(int j = 0; j < lista.size() - i - 1; j++){
		   
				if(lista.get(j).getPreco() > lista.get(j + 1).getPreco()){
					aux = lista.get(j + 1);
					lista.set(j + 1, lista.get(j));
					lista.set(j, aux);
				}
			}
		}
		
		return lista;
	}
	
	public List<Produto> ordenarDecrescente(List<Produto> lista) {
		Produto aux;
		
		for (int i = 0; i < lista.size() - 1; i++){
			
			for(int j = 0; j < lista.size() - i - 1; j++){
		   
				if(lista.get(j).getPreco() < lista.get(j + 1).getPreco()){
					aux = lista.get(j + 1);
					lista.set(j + 1, lista.get(j));
					lista.set(j, aux);
				}
			}
		}
		
		return lista;
	}

}