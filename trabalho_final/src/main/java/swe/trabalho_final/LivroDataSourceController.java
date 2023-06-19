package swe.trabalho_final;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroDataSourceController {

	@RequestMapping(value="adicionar_livro", method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Livro adicionarLivro(@RequestBody Livro livro) {
		LivroDataSource.adicionarLivro(livro);
		return livro;
	}
	
	@RequestMapping(value="get_all", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Livro> getAll() {
		return LivroDataSource.getAll();
	}
	
	@RequestMapping(value="get_por_isbn", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Livro getPorIsbn(@RequestBody int isbn) {
		return LivroDataSource.getPorIsbn(isbn);
	}
	
	@RequestMapping(value="get_por_autor", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Livro> getPorAutor(@RequestBody String autor) {
		return LivroDataSource.getPorAutor(autor);
	}
	
	@RequestMapping(value="get_por_titulo", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Livro> getPorTitulo(@RequestBody String titulo) {
		return LivroDataSource.getPorTitulo(titulo);
	}
	
	@RequestMapping(value="get_todos_contendo", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<List<Livro>> getTodosContendo(@RequestBody String titulo) {
		return LivroDataSource.getTodosContendo(titulo);
	}
	
	@RequestMapping(value="get_por_isbn_dto", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LivroDTO getPorIsbnDTO(@RequestBody int isbn) {
		return LivroDataSource.getPorIsbnDTO(isbn);
	}
	
	@RequestMapping(value="get_all_dto", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LivroDTO> getAllDTO() {
		return LivroDataSource.getAllDTO();
	}
	
	@RequestMapping(value="reajustar_preco_por_id", method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Livro reajustarPrecoPorId(@RequestBody int id, int taxa) {
		return LivroDataSource.reajustarPrecoPorId(id, taxa);
	}
	
	@RequestMapping(value="reajustar_preco", method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Livro> reajustarPreco(@RequestBody int taxa) {
		LivroDataSource.reajustarPreco(taxa);
		return LivroDataSource.getAll();
	}
	
	@RequestMapping(value="delete_por_id", method=RequestMethod.DELETE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deletePorId(@RequestBody int id) {
		LivroDataSource.deletePorId(id);
	}
	
	@RequestMapping(value="delete_all", method=RequestMethod.DELETE)
	public void deleteAll() {
		LivroDataSource.deleteAll();
	}

}
