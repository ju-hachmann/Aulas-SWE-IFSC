package com.example.demo;

public class ProdutoDTO {

	private int id;
	private String nome;
	private double precoVenda;
	
	public ProdutoDTO(int id, String nome, double precoVenda) {
		this.id = id;
		this.nome = nome;
		this.precoVenda = precoVenda;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}
	
		
}
