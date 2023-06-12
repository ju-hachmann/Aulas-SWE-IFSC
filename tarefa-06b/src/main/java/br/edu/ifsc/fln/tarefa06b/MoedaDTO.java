package br.edu.ifsc.fln.tarefa06b;

public class MoedaDTO {
	
	private String moeda;
	private double compra;
	private double venda;
	
	public MoedaDTO(String moeda, double compra, double venda) {
		this.moeda = moeda;
		this.compra = compra;
		this.venda = venda;
	}

	// Olha que interessante
	// O json que ele retorna pega o nome do atributo do método get
	// E não do atributo em si
	public String getMoeda() {
		return moeda;
	}

	public double getCompra() {
		return compra;
	}

	public double getVenda() {
		return venda;
	}
	

}
