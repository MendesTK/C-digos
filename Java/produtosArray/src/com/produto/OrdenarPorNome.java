package com.produto;

import java.util.List;

public class OrdenarPorNome implements Ordenacao {
	public List<Produto> ordenarCrescente(List<Produto> lista) {
		Produto aux;
		
		for (int i = 0; i < lista.size(); i++) 
		{
		    for (int j = i + 1; j < lista.size(); j++) 
		    {
		        if (lista.get(i).getNome().compareTo(lista.get(j).getNome()) > 0) {
		            aux = lista.get(i);
		            lista.set(i, lista.get(j));
		            lista.set(j, aux);
		        }
		    }
		}
		
		return lista;
	}
	
	public List<Produto> ordenarDecrescente(List<Produto> lista) {
		Produto aux;
		
		for (int i = 0; i < lista.size(); i++) 
		{
		    for (int j = i + 1; j < lista.size(); j++) 
		    {
		        if (lista.get(i).getNome().compareTo(lista.get(j).getNome()) < 0) {
		            aux = lista.get(i);
		            lista.set(i, lista.get(j));
		            lista.set(j, aux);
		        }
		    }
		}
		
		return lista;
	}
}
