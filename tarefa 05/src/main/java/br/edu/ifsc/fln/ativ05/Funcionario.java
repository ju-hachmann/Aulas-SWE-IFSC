package br.edu.ifsc.fln.ativ05;

public class Funcionario {
	
	// Atributos de Funcionário (todos privados)
	private int matricula;
	private String nome;
	private double salarioBase;
	private int numeroDependentes;
	
	// Método construtor de um novo objeto
	public Funcionario(int mat, String nome, double sal, int dep) {
		matricula = mat;
		this.nome = nome;
		salarioBase = sal;
		numeroDependentes = dep;
	}
	
	// Métodos privados internos para calcular salário família e desconto do IR
	// Deixar privados por enquanto
	private double calcularSalarioFamilia() {
		return numeroDependentes * 150;
	}
	
	private double calcularIR() {
		double desconto = 0.0;
		if (salarioBase >= 8500) 
			desconto = 0.275;
		else if (salarioBase >= 5000) 
			desconto = 0.15;  
		return salarioBase * desconto;
	}

	// Getters e Setters gerados automaticamente: 
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getNumeroDependentes() {
		return numeroDependentes;
	}

	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}	
	
	public double calcularSalarioLiquido() {
		return salarioBase - calcularIR() + calcularSalarioFamilia();
	}

}
