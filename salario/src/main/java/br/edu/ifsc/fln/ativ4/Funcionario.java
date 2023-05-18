package br.edu.ifsc.fln.ativ4;

public class Funcionario {
	
	private String nome;
	private double salarioBase;
	private int dependentes;
	
	public Funcionario (String n, double s, int d) {
		this.nome = n;
		this.salarioBase = s;
		this.dependentes = d;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public int getDependentes() {
		return this.dependentes;
	}
	
	public double calcularDescontoIR() {
		double percDesconto = 0;
		if (this.salarioBase >= 8500) {
			percDesconto = 27.5;
		}
		else if(this.salarioBase >= 5000) {
			percDesconto = 15;
		}
		return this.salarioBase * percDesconto / 100;
	}
	
	public double calcularSalarioFamilia() {
		return this.dependentes * 150;
	}
	
	public double calcularSalarioLiquido() {
		return this.salarioBase - this.calcularDescontoIR() + this.calcularSalarioFamilia();
	}

}
