package br.edu.ifsc.fln.ativ04;

public class Funcionario {
	
	private String nome;
	private Salario salario;
	private int dependentes;
	
	public Funcionario (String nome, double salBase, int dep) {
		this.nome = nome;
		this.salario = new Salario(salBase, dep);
		this.dependentes = dep;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getDependentes() {
		return this.dependentes;
	}
	
	public double getSalarioBase() {
		return this.salario.getValorBase();
	}
	
	public double getSalarioLiquido() {
		return this.salario.getValorLiquido();
	}
	
}
