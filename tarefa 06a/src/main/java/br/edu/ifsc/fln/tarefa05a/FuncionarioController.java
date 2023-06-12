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
				
		return FuncionarioDTOMaker.getSalarioLiquido(salarioBruto);
	}
	
	
	@RequestMapping( 
			value="/salario_completo/{salarioBruto}", 
			method=RequestMethod.GET)
	
	public FuncionarioDTO calcularTudo(
			@PathVariable double salarioBruto) {

		return FuncionarioDTOMaker.getFuncionarioCompleto(salarioBruto);
	}
	
}
