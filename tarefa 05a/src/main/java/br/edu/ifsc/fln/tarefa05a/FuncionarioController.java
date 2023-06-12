package br.edu.ifsc.fln.tarefa05a;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  

public class FuncionarioController {

	@RequestMapping(
			value="/salario_liquido/{salarioBruto}", 
			method=RequestMethod.GET)
	
	public double calcularSalarioLiquido(
			@PathVariable double salarioBruto) {
		
		// Para usar a lógica das classes DTO
		// Passei todos os atributos para o construtor do DTO
		// Não poderia apenas passar o objeto funcionario inteiro e lá dentro da classe fazer as atribuições necessárias?

		Funcionario funcionario = new Funcionario(salarioBruto);
		FuncionarioDTO funcionarioDTO = new FuncionarioDTO(
				funcionario.getSalarioBruto(),
				funcionario.getIRPF(),
				funcionario.getINSS(),
				funcionario.getSalarioLiquido()
				);
		
		return funcionarioDTO.getSalarioLiquido();
	}
	
	
	@RequestMapping( 
			value="/salario_completo/{salarioBruto}", 
			method=RequestMethod.GET)
	
	public FuncionarioDTO calcularTudo(
			@PathVariable double salarioBruto) {
		Funcionario funcionario = new Funcionario(salarioBruto);
		FuncionarioDTO funcionarioDTO = new FuncionarioDTO(
				funcionario.getSalarioBruto(),
				funcionario.getIRPF(),
				funcionario.getINSS(),
				funcionario.getSalarioLiquido()
				);
		return funcionarioDTO;
	}
	
}
