package br.edu.ifsc.fln.tarefa06b;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MoedaController {

	
	// Coloquei toda a lógica de criação dos DTOs no DataSource
	// Verificar se está correto ou errado
	
	
	@RequestMapping(value="/converter_moeda/{valor}/{tipoMoeda}/{tipoOperacao}", method=RequestMethod.GET)
	public double calcularConversao(
			@PathVariable double valor, 
			@PathVariable String tipoMoeda, 
			@PathVariable String tipoOperacao) {
		return MoedaDataSource.unicaMoedaConversao(tipoMoeda, valor, tipoOperacao);
	}
	
	
	@RequestMapping(value="/converter_moeda/{valor}/{tipoOperacao}", method=RequestMethod.GET)
	public MoedaConversaoTodasDTO calcularConversaoDeTodas(
			@PathVariable double valor, 
			@PathVariable String tipoOperacao) {
		return MoedaDataSource.todasMoedasConversao(valor, tipoOperacao);	
	}
	
	
	@RequestMapping(value="/cotacao_moeda", method=RequestMethod.GET)
	public List<MoedaDTO> cotacoes() {
		return MoedaDataSource.criarListaMoedasDTO();
	}
	
}		
