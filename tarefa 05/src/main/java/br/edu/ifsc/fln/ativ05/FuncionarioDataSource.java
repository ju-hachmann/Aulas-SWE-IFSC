package br.edu.ifsc.fln.ativ05;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {

	private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static void criarLista() {
		// Método apenas para simular dados existentes
		listaFuncionarios.add(new Funcionario(1, "Juliana", 6000, 4));
		listaFuncionarios.add(new Funcionario(2, "Marcos", 20000, 3));
		listaFuncionarios.add(new Funcionario(3, "Elon Musk", 1328, 5));
		listaFuncionarios.add(new Funcionario(4, "Gretchen", 50000, 2));
	}
	
	public static List<Funcionario> getLista() {
		return listaFuncionarios;
	}
	 
	public static void addFuncionario(Funcionario func) {
		listaFuncionarios.add(func);
	}
	
	
	public static Funcionario getFuncionario(int matricula) {
		
		// Usando um loop para procurar a matrícula na lista:
		for (Funcionario funcionario : listaFuncionarios) {
			if (matricula == funcionario.getMatricula()) {
				return funcionario;
			}
		}
		
		// Aqui fiz uma gambiarra
		// o correto seria try/catch (mas ainda não sei fazer)
		return new Funcionario(0, "Não existente", 0.0, 0); 
	}
	
	
	public static double getSalariodeFuncionario(int matricula) {
		Funcionario funcionario = getFuncionario(matricula);
		return funcionario.calcularSalarioLiquido();		
	}
	
	
}
