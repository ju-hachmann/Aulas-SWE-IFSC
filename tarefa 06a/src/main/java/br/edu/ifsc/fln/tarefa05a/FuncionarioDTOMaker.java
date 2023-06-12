package br.edu.ifsc.fln.tarefa05a;

// Esta classe existe apenas para tirar a criação do DTO lá do Controller
// Esta classe faria o acesso ao Banco de Dados, por exemplo
// Aqui tô só testando pensar em uma forma de tirar o máximo possível de lógica do Controller


public class FuncionarioDTOMaker {

	
	public static double getSalarioLiquido(double salarioBruto) {
		Funcionario funcionario = new Funcionario(salarioBruto);
		FuncionarioDTO funcionarioDTO = new FuncionarioDTO(
				funcionario.getSalarioBruto(),
				funcionario.getIRPF(),
				funcionario.getINSS(),
				funcionario.getSalarioLiquido()
				);
		return funcionarioDTO.getSalarioLiquido();
	}
	
	
	public static FuncionarioDTO getFuncionarioCompleto(double salarioBruto) {
		Funcionario funcionario = new Funcionario(salarioBruto);
		return new FuncionarioDTO(
				funcionario.getSalarioBruto(),
				funcionario.getIRPF(),
				funcionario.getINSS(),
				funcionario.getSalarioLiquido()
				);
	}

	
}
