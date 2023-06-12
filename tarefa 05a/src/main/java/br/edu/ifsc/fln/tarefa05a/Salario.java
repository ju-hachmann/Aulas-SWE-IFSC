package br.edu.ifsc.fln.tarefa05a;

// Tentei separar a lógica do Salário da lógica do Funcionário
// Nessa atividade não precisaria
// Mas só para ir treinando como ficaria a "separação de responsabilidades"

public class Salario {

	private double valorBruto;
	
	public Salario(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	
	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double calcularValorIRPF() {
		
		if (valorBruto <= 1903.98) {
			return 0;
		}
		else if (valorBruto <= 2826.65) {
			return (valorBruto * 0.075) - 142.80;
		}
		else if (valorBruto <= 3751.05) {
			return (valorBruto * 0.15) - 354.80;
		}
		else if (valorBruto <= 4664.68) {
			return (valorBruto * 0.225) - 636.13;
		}
		else {
			return (valorBruto * 0.275) - 869.36;
		}
	}
	
	
	public double calcularValorINSS() {
		
		if (valorBruto <= 1045) {
			return valorBruto * 0.075;
		}
		else if (valorBruto <= 2089.60) {
			return valorBruto * 0.09;
		}
		else if (valorBruto <= 3134.40) {
			return valorBruto * 0.12;
		}
		else if (valorBruto <= 6101.06) {
			return valorBruto * 0.14;
		}
		else {
			return valorBruto * 0.15; // Ué? Para faixa superior 6101.06??
		}
		
	}
	
	public double calcularValorLiquido() {
		return valorBruto - calcularValorINSS() - calcularValorIRPF();
	}
	
	
}
