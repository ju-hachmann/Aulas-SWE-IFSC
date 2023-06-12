package br.edu.ifsc.fln.tarefa06b;

import java.util.List;
import java.util.ArrayList;

public class MoedaDataSource {

	
	private static List<Moeda> listaMoedas = new ArrayList<>();
	private static List<MoedaDTO> listaMoedasDTO;
	
	
	public static void criarListaMoedas() {
		listaMoedas.add(new Moeda("DC", 5.6061, 5.6066));
		listaMoedas.add(new Moeda("DP", 5.69, 5.79));
		listaMoedas.add(new Moeda("DX", 5.6058, 5.6064));
		listaMoedas.add(new Moeda("DT", 5.5430, 5.7530));
		listaMoedas.add(new Moeda("EU", 6.5630, 6.8070));
		listaMoedas.add(new Moeda("OU", 346.70, 1.88));
	}
	
	
	// Atenção! Não usar == para comparar strings (mais de uma hora pra descobrir isso)
	// https://www.softblue.com.br/blog/java-strings-nao-use-operador-de-igualdade/
	
	public static Moeda getMoedaByTipo(String tipo) {
		for (Moeda moeda : listaMoedas) {
			if (moeda.getTipo().equals(tipo.toUpperCase())) {
				return moeda;
			}
		}
		return null;
	}

	
	public static List<Moeda> getListaMoedas() {
		return listaMoedas;
	}
	
	
	public static List<MoedaDTO> criarListaMoedasDTO() {
		listaMoedasDTO = new ArrayList<>();
		for (Moeda moeda : listaMoedas) {
			listaMoedasDTO.add(new MoedaDTO(moeda.getTipo(), moeda.getCompra(), moeda.getVenda()));
		}
		return listaMoedasDTO;
	}
	
	
	public static double unicaMoedaConversao(String tipoMoeda, double valor, String tipoOperacao) {
		return new MoedaConversaoDTO(
				MoedaDataSource.getMoedaByTipo(tipoMoeda).converter(valor, tipoOperacao))
				.getValorConvertido();
	}
	
	
	public static MoedaConversaoTodasDTO todasMoedasConversao(double valor, String tipoOperacao) {
		return new MoedaConversaoTodasDTO (
				valor, tipoOperacao, 
				getMoedaByTipo("dc").converter(valor, tipoOperacao),
				getMoedaByTipo("dp").converter(valor, tipoOperacao),
				getMoedaByTipo("dx").converter(valor, tipoOperacao),
				getMoedaByTipo("dt").converter(valor, tipoOperacao),
				getMoedaByTipo("eu").converter(valor, tipoOperacao),
				getMoedaByTipo("ou").converter(valor, tipoOperacao));
	}
	
	
}
