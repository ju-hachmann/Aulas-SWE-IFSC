package br.edu.ifsc.fln.ativ04;

public class Salario {

	// Testando com duas classes para tentar separar responsabilidades
	// VER "ACOPLAMENTO"... 
	
	private double valorBase;
	private int dependentes;
	
	public Salario(double base, int dep) {
		this.valorBase = base;
		this.dependentes = dep;
	}
	
	public double getValorBase() {
		return this.valorBase;
	}
	
	public double getValorLiquido() {
		return this.calcularSalarioLiquido();
	}
	
	private double calcularDescontoIR() {
		double percDesconto = 0;
		if (this.valorBase >= 8500) {
			percDesconto = 27.5;
		}
		else if(this.valorBase >= 5000) {
			percDesconto = 15;
		}
		return this.valorBase * percDesconto / 100;
	}
	
	private double calcularSalarioFamilia() {
		return this.dependentes * 150;
	}
	
	private double calcularSalarioLiquido() {
		return this.valorBase - this.calcularDescontoIR() + this.calcularSalarioFamilia();
	}
	
}
