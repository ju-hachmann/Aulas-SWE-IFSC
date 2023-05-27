package br.edu.ifsc.fln.ativ05;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {

	private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static void criarLista() {
		// Método apenas para simular dados existentes
		addFuncionario(new Funcionario(1, "Juliana", 6000, 4));
		addFuncionario(new Funcionario(2, "Marcos", 20000, 3));
		addFuncionario(new Funcionario(3, "Elon Musk", 1328, 5));
		addFuncionario(new Funcionario(4, "Gretchen", 50000, 2));
	}
	
	public static List<Funcionario> getLista() {
		return listaFuncionarios;
	}
	
	public static void addFuncionario(Funcionario func) {
		listaFuncionarios.add(func);
	}
	
	
	public static Funcionario getFuncionario(int matricula) {
		
		// na vídeo-aula, o professor usa o método get(index)
		// próprio das listas, que retorna o item no index indicado
		// Só que não dá para supor que a pessoa irá criar o dataSource nesta sequência
		// Se ela adicionar a matrícula 2 antes da 1, o método get(index) já não vai mais dar o resultado que queremos
		// Então vamos tentar fazer diferente:
		
		// Usamos um loop para percorrer a lista de funcionários um a um
		// e checar se o funcionario da lista bate com a matrícula que estamos pedindo
		// se bater, retorna o funcionário
		for (Funcionario funcionario : listaFuncionarios) {
			if (matricula == funcionario.getMatricula()) {// Obs: funcionario.getMatricula() é um método de funcionário, que definimos no arquivo Funcionario.java
				return funcionario;
			}
		}
		// se o programa ler até aqui, é porque não existe funcionário com a matrícula na lista
		// então retornar um funcionário que denote erro
		// Aqui fiz uma gambiarra
		// o correto seria try/catch (mas ainda não sei fazer)
		return new Funcionario(0, "Não existente", 0.0, 0); 
	}
	
	
	public static double getSalariodeFuncionario(int matricula) {
		// Primeiro vamos procurar o funcionário que tem a matrícula
		// Usando o método que escrevemos acima:
		Funcionario funcionario = getFuncionario(matricula);
		// Agora que temos o funcionario, vamos apenas chamar o método dele de calcularSalarioLiquido
		// Lembrando que os métodos de funcionários estão no arquivo Funcionario.java
		return funcionario.calcularSalarioLiquido();
		
	}
	
	
}
