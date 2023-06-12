package br.edu.ifsc.fln.tarefa06a;

// Classes DTO
// Não devem conter regra de negócio
// Para garantir que os dados que ela transfere sejam sempre idênticos aos do objeto original
// Vamos passar ao seu construtor os dados que ela necessita para existir
// Nenhum cálculo vai ser feito dentro dela

public class FuncionarioDTO {

	private double salarioBruto;
	private double irpf;
	private double inss;
	private double salarioLiquido;	
	
	public FuncionarioDTO(double salarioBruto, double irpf, double inss, double salarioLiquido) {
		this.salarioBruto = salarioBruto;
		this.irpf = irpf;
		this.inss = inss;
		this.salarioLiquido = salarioLiquido;
	}

	// Pode ter setters aqui? Qual seria o sentido?
	
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	
	public double getIrpf() {
		return irpf;
	}

	
	public double getInss() {
		return inss;
	}

	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	
}
