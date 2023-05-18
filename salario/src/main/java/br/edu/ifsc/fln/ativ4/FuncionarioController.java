package br.edu.ifsc.fln.ativ4;

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
			@PathVariable("salarioBase") double salBase, 
			@PathVariable("dependentes") int dep ) {
		
		if (salBase < 0 || dep < 0) {
			return 0;
		}
		
		Funcionario func = new Funcionario(nome, salBase, dep);
		return func.calcularSalarioLiquido();
		
	}
	
}
