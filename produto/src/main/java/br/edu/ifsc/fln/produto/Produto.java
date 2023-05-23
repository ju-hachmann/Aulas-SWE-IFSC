package br.edu.ifsc.fln.produto;

public class Produto {

	//private double valorUnitario;
	//private int quantidade;
	
//	public Produto (double valorUnitario, int quantidade) {
//		// aqui teria que ver como seria para passar argumentos opcionais para o contrutor
//		this.quantidade = quantidade;
//		this.valorUnitario = valorUnitario;
//	}
//	
//	public int getQuantidade() {
//		return this.quantidade;
//	}
//	
//	public double getValorUnitario() {
//		return this.valorUnitario;
//	}
//	
	public static double calcularValorTotal (double valorUnitario, int quantidade) {
		return valorUnitario * quantidade;
	}
	
	public static double calcularPrecoVenda(double valorUnitario, double margemLucro) {
		return valorUnitario + (valorUnitario * margemLucro / 100);
	}
	
	
}
