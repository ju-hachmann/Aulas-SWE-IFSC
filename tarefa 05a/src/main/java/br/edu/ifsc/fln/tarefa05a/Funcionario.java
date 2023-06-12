package br.edu.ifsc.fln.tarefa05a;


public class Funcionario {
	
	private Salario salarioBruto;
	
	public Funcionario(double salarioBruto) {
		this.salarioBruto = new Salario(salarioBruto);
	}

	public double getSalarioBruto() {
		return salarioBruto.getValorBruto();
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto.setValorBruto(salarioBruto);
	}
	
	// Método público para ser acessado pelo DTO
	// Não sei se é a melhor forma, mas..
	// Outra dúvida: pode usar um getAlgo, mesmo quando este Algo não é de fato um atributo? Ou é uma má prática?
	public double getIRPF() {
		return this.salarioBruto.calcularValorIRPF();
	}
	
	
	// Método público para ser acessado pelo DTO
	public double getINSS() {
		return this.salarioBruto.calcularValorINSS();	
	}
	
	
	public double getSalarioLiquido() {
		return this.salarioBruto.calcularValorLiquido();
	}

	

	
}
