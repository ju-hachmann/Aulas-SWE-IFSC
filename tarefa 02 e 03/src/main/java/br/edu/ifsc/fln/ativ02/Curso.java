package br.edu.ifsc.fln.ativ02;

public class Curso {
	
	private final long id;
	private final String nome;
	private final int cargaHoraria;
	
	public long getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCargaHoraria() {
		return this.cargaHoraria;
	}
	
	public Curso(long id, String nome, int cargaHoraria) {
		this.id = id;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

}
