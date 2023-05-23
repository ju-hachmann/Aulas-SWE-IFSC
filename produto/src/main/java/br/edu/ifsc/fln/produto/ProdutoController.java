package br.edu.ifsc.fln.produto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProdutoController {
		
	@RequestMapping(value="/valor_total/{quantidade}/{valorUnitario}",
					method=RequestMethod.GET)
	public double valorTotal(
			@PathVariable("quantidade") int quantidade,
			@PathVariable("valorUnitario") double valorUnitario) {
		return Produto.calcularValorTotal(valorUnitario, quantidade);
		
		// chamada a método estático (qual vantagem ou desvantagem disso?)
		// Vantagem: não depende de um objeto, isto é, funciona sem objeto e seus atributos
		// Desvantagem: precisa passar argumentos para ele, não vai acessar os atributos internos...
	}
		
	@RequestMapping(value="/preco_venda/{valorUnitario}/{margemLucro}",
					method=RequestMethod.GET)
	public double precoVenda( 
			@PathVariable("valorUnitario") double valorUnitario, 
			@PathVariable("margemLucro") double margemLucro) {
		return Produto.calcularPrecoVenda(valorUnitario, margemLucro);
	}

}
