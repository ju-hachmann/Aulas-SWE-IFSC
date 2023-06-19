package swe.trabalho_final;

import java.util.List;
import java.util.ArrayList;

public class LivroDataSource {

	public static List<Livro> livros = new ArrayList<>();
	
	public static void criarLista() {
		livros.add(new Livro(1, 858044, "Clube da Luta", "Chuck Palahniuk", "Leya", 49.90));
		livros.add(new Livro(2, 853363, "Senhor dos Aneis", "J. R. R. Tolkien", "Martins Fontes", 69.99));
		livros.add(new Livro(3, 853595, "1984", "George Orwell", "Cia das Letras", 18.95));
		livros.add(new Livro(4, 655830, "Lutando na Espanha", "George Orwell", "Biblioteca Azul", 26.90));
		livros.add(new Livro(5, 852505, "Admirável Mundo Novo", "Aldous Huxley", "Cia das Letras", 35.95));
		livros.add(new Livro(6, 107963, "O Capital - Volume I", "Karl Marx", "Boitempo", 125));
		livros.add(new Livro(7, 857326, "Noites Brancas", "Fiódor Dostoievski", "Editora 34", 37.99));
		livros.add(new Livro(8, 857175, "Quincas Borba", "Machado de Assis", "Garnier", 29.90));
		livros.add(new Livro(9, 859571, "Discurso sobre o Colonialismo", "Aimé Césaire", "Veneta", 35.96));
		livros.add(new Livro(10, 857164, "Sobre História", "Eric J. Hobsbawm", "Cia das Letras", 36.90));
		livros.add(new Livro(11, 855652, "Senhor das Moscas", "William Golding", "Alfaguara", 36.90));
	}
	
	// O que dá de melhorar?
	// a) Fazer um id autoincremento (Usar o tipo que ele mostrou nas primeiras aulas)
	// b) Fazer uma busca geral (por qualquer campo)
	// c) Na classe Livro, melhorar a parte reajuste de preço (FEITO)
	// d) Não permitir a inclusão de itens idênticos (mesmo isbn) (apenas pelo teste de como seria)
	// e) Fazer uma página pra se conectar com isso tudo aí =D
	// f) Elaborar responses e try/catch que facilitem a vida de quem usa a API
	// g) Pedir autenticação para todos os métodos que não sejam o Get
	// h) Fazer a documentação da API bonitinha e chamar ela de minha primeira API <3
	// O que posso aprender fazendo tudo isto?
	// Posso aprender sobre apis, pq não iremos ver novamente
	// Esse foi o primeiro momento que eu gostaria de estar sem a bolsa, na verdade =(
	// Poderia ter mais tempo para debulhar nisso!
	
	public static Livro adicionarLivro(Livro livro) {
		livros.add(livro);
		return livro;
	}
	
	public static List<Livro> getAll() {
		return livros;
	}
	
	public static Livro getPorIsbn(int isbn) {
		for(Livro livro : livros) {
			if (livro.getIsbn() == isbn) {
				return livro;
			}
		}
		return null;
	}
	
	public static List<Livro> getPorAutor(String autor) {
		List<Livro> resultadoBusca = new ArrayList<>();
		for(Livro livro : livros) {
			if (livro.getAutor().contains(autor)) {
				resultadoBusca.add(livro);
			}
		}
		return resultadoBusca;
	}
	
	public static List<Livro> getPorTitulo(String titulo) {
		List<Livro> resultadoBusca = new ArrayList<>();
		for(Livro livro : livros) {
			if (livro.getTitulo().contains(titulo)) {
				resultadoBusca.add(livro);
			}
		}
		return resultadoBusca;
	}
	
	// Essa aqui ficou redundante pq coloquei contains() nas duas buscas acima
	// Vou modificar esta pra ser uma busca geral (por todos os campos)
	public static List<List<Livro>> getTodosContendo(String titulo) {
		// Apresenta resultados hierarquizados, primeiro os que correspondem exatamente à busca
		// e depois os que contém o termo de busca
		// Só uma tentativa para fazer algo do tipo
		List<Livro> resultadoEquals = new ArrayList<>();
		List<Livro> resultadoContains = new ArrayList<>();
		for(Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				resultadoEquals.add(livro);
			}
			else if (livro.getTitulo().contains(titulo)) {
				resultadoEquals.add(livro);
			}
		}
		// List<List<Livro>> ??? Deve existir outro tipo q não seja a List par dar conta disto
		List<List<Livro>> resultadoBusca = new ArrayList<>();
		resultadoBusca.add(resultadoEquals);
		resultadoBusca.add(resultadoContains);
		return resultadoBusca;
	}

	private static boolean matchesEquals() {
		// o argumento passado precisa ser tanto numero quanto qq outra coisa...
		return true;
	}

	private static boolean matchesContains() {
		// mesma coisa de cima
		return true;
	}

	
	public static LivroDTO getPorIsbnDTO(int isbn) {
		for(Livro livro : livros) {
			if (livro.getIsbn() == isbn) {
				return new LivroDTO(livro.getTitulo(), livro.getAutor(), livro.getEditora(), livro.getPreco());
			}
		}
		return null;
	}
	
	public static List<LivroDTO> getAllDTO() {
		List<LivroDTO> livrosDTO = new ArrayList<>();
		for(Livro livro : livros) {
			livrosDTO.add(new LivroDTO(livro.getTitulo(), livro.getAutor(), livro.getEditora(), livro.getPreco()));
		}
		return livrosDTO;
	}
	
	public static Livro getPorId(int id) {
		for(Livro livro : livros) {
			if (livro.getId() == id) {
				return livro;
			}
		}
		return null;
	}
	
	public static Livro reajustarPrecoPorId(int id, int taxa) {
		Livro livro = getPorId(id);
		if (livro != null) {
			livro.reajustarPreco(taxa);
		}
		return livro;
	}
	
	public static void reajustarPreco(int taxa) {
		for(Livro livro : livros) {
			livro.reajustarPreco(taxa);
		}
	}
		
	public static void deletePorId(int id) {
		for(Livro livro : livros) {
			if (livro.getId() == id) {
				livros.remove(livro);
				return;
			}
		}
	}
	
	public static void deleteAll() {
		livros.clear();
	}
	
}
 