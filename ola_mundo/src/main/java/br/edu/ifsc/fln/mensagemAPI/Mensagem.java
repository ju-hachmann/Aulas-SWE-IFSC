package br.edu.ifsc.fln.mensagemAPI;


public class Mensagem {
	private final long id;
	private final String conteudo;
	
	public Mensagem (long id, String conteudo) {
		this.id = id;
		this.conteudo = conteudo;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getConteudo() {
		return this.conteudo;
	}
	
	
}
