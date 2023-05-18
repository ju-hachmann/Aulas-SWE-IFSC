package br.edu.ifsc.fln.ativ04;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FuncionarioController {

	@RequestMapping(
			value = "/calcular_salario/{nome}/{salarioBase}/{dependentes}",
			method = RequestMethod.GET)
	public double calcular_salario (
			@PathVariable("nome") String nome, 
			@PathVariable("salarioBase") double salarioBase, 
			@PathVariable("dependentes") int dependentes ) {
		
		// Checagem simples
		// Se a entrada de salarioBase ou dependentes for menor que 0, quero que retorne 0
		if (salarioBase < 0 || dependentes < 0) {
			return 0;
		}
		
		return new Funcionario(nome, salarioBase, dependentes).getSalarioLiquido();
		
	}
	
}