package br.edu.ifsc.fln.tarefa06b;


public class MoedaConversaoTodasDTO {

	private double valor;
	private String operacao;
	private double DC;
	private double DP;
	private double DX;
	private double DT;
	private double EU;
	private double OU;
	
	
	public MoedaConversaoTodasDTO(double valor, String operacao, double dC, double dP, double dX, double dT,
			double eU, double oU) {
		this.valor = valor;
		this.operacao = operacao;
		DC = dC;
		DP = dP;
		DX = dX;
		DT = dT;
		EU = eU;
		OU = oU;
	}

	
	public double getValor() {
		return valor;
	}

	public String getOperacao() {
		return operacao;
	}

	public double getDC() {
		return DC;
	}

	public double getDP() {
		return DP;
	}

	public double getDX() {
		return DX;
	}

	public double getDT() {
		return DT;
	}

	public double getEU() {
		return EU;
	}

	public double getOU() {
		return OU;
	}
	

	
}
