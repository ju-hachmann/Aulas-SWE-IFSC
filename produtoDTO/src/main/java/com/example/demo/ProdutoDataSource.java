package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataSource {

	private static List<Produto> listaProdutos = new ArrayList<>();
	private static List<ProdutoDTO> listaProdutosDTO = new ArrayList<>();
	
	public static void criarLista() {
		listaProdutos.add(new Produto(1, "Tenis", 10, 120.0, 30));
		listaProdutos.add(new Produto(2, "Sapato", 50, 200.0, 10));
		listaProdutos.add(new Produto(3, "Calça", 4, 125.0, 20));
		listaProdutos.add(new Produto(4, "Casaco", 33, 128.0, 30));
		listaProdutos.add(new Produto(5, "Camiseta", 12, 123.0, 5));
	}
	
	public static void criarListaDTO() {
		for (Produto produto : listaProdutos) {
			listaProdutosDTO.add(new ProdutoDTO(produto.getId(), produto.getNome(), produto.calcularPrecoVenda()));
		}
	}
	
	public static List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public static List<ProdutoDTO> getListaProdutosDTO() {
		criarListaDTO();
		return listaProdutosDTO;
	}
	
	public static void novo(Produto produto) {
		listaProdutos.add(produto);
	}
	
}
