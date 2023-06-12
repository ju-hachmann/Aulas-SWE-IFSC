package br.edu.ifsc.fln.tarefa06b;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Moeda {

	private String tipo;
	private double compra;
	private double venda;
	
	public Moeda(String tipo, double compra, double venda) {
		this.tipo = tipo;
		this.compra = compra;
		this.venda = venda;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCompra() {
		return compra;
	}

	public void setCompra(double compra) {
		this.compra = compra;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}
	
	// Para conversão poderia ter criado uma classe separada
	// Mas achei mais simples fazer aqui dentro mesmo
	// Mesmo que tenha que passar sempre argumentos externos para os métodos
	public Double converter(double valor, String tipoOperacao) {
	
		BigDecimal valorAConverter = new BigDecimal(String.valueOf(valor));
		BigDecimal valorConvertido;
		
		if (tipoOperacao.equals("compra")) {
			valorConvertido = comprar(valorAConverter);
		}
		else if (tipoOperacao.equals("venda")) {
			valorConvertido = vender(valorAConverter);
		}
		else return null;
		
		return valorConvertido.doubleValue();
		
	}
	
	
	private BigDecimal comprar(BigDecimal valorAConverter) {

		BigDecimal cambioCompra = new BigDecimal(String.valueOf(this.compra));
		
		return valorAConverter.multiply(cambioCompra).setScale(2, RoundingMode.HALF_DOWN); 
		
	}
	
	
	private BigDecimal vender(BigDecimal valorAConverter) {
		
		double valorVenda = this.venda;
		
		if (this.tipo.equals("OU")) {
			valorVenda = this.compra + (this.compra * this.venda / 100);
		}
		
		BigDecimal cambioVenda = new BigDecimal(String.valueOf(valorVenda));	
		
		return valorAConverter.divide(cambioVenda, 2, RoundingMode.HALF_DOWN); 
		
	}
	

	
}
