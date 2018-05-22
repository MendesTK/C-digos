package com.produto;

import java.util.List;

public class ProdutosView {
	public static void print(List<Produto> produtos, String titulo) {
		System.out.println("---------- " + titulo + " -----------");

		for (int i = 0; i < produtos.size(); i++) {
			System.out.println(produtos.get(i).getNome() + ": R$" + produtos.get(i).getPreco());
		}
		System.out.println("---------------------------------");

		System.out.println();
	}
}
