package br.edu.ifsc.fln.ativ05;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {
	
	
	// 01 - novo funcionario
	@RequestMapping(
			value="/novo/{mat}/{nome}/{sal}/{dep}", 
			method=RequestMethod.GET)
	public Funcionario criarNovo(
			@PathVariable("mat") int matricula, 
			@PathVariable("nome") String nome,
			@PathVariable("sal") double salarioBase, 
			@PathVariable("dep") int dependentes) {
		
		// TODO Deveria haver uma checagem para não permitir adicionar funcionário com matrícula duplicada
		// Perguntar ao professor se esta lógica toda cabe ao Controller
		// Ou deveria estar no Model
		
		Funcionario fulano = new Funcionario(matricula, nome, salarioBase, dependentes);		
		FuncionarioDataSource.addFuncionario(fulano);
		return fulano;
	}
	
	
	// 02 - listar todos os funcionarios
	@RequestMapping(
			value="/listar", // podia ser só "/" pra facilitar
			method=RequestMethod.GET)
	public List<Funcionario> listar() {
		return FuncionarioDataSource.getLista();
	}
	
	
	// 03 - pesquisar funcionario por matrícula
	@RequestMapping(
			value="/pesquisar/{mat}",
			method=RequestMethod.GET)
	public Funcionario getFuncionario(
			@PathVariable("mat") int matricula) {
		return FuncionarioDataSource.getFuncionario(matricula);
	}
	
	
	// 04 - calcular sal líquido dada a matrícula
	@RequestMapping(
			value="/salario/{mat}",
			method=RequestMethod.GET)
	public double getSalario(
			@PathVariable("mat") int matricula) {
		return FuncionarioDataSource.getSalariodeFuncionario(matricula);
		
		// Outra opção:
		// return FuncionarioDataSource.getFuncionario(matricula).calcularSalarioLiquido();
	}

	
}
