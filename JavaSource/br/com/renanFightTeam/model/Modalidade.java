package br.com.renanFightTeam.model;

public class Modalidade {

	private int codigoModalidade;
	private String nomeModalidade;
	private Status statusModalidade;
	
	/**
	 * 
	 */
	public Modalidade() {
		
	}
	
	/**	
	 * @param codigoModalidade
	 * @param nomeModalidade
	 * @param statusModalidade
	 */
	public Modalidade(int codigoModalidade, String nomeModalidade,
			Status statusModalidade) {
		super();
		this.codigoModalidade = codigoModalidade;
		this.nomeModalidade = nomeModalidade;
		this.statusModalidade = statusModalidade;
	}




	/**
	 * @return the codigoModalidade
	 */
	public int getCodigoModalidade() {
		return codigoModalidade;
	}
	/**
	 * @param codigoModalidade the codigoModalidade to set
	 */
	public void setCodigoModalidade(int codigoModalidade) {
		this.codigoModalidade = codigoModalidade;
	}
	/**
	 * @return the nomeModalidade
	 */
	public String getNomeModalidade() {
		return nomeModalidade;
	}
	/**
	 * @param nomeModalidade the nomeModalidade to set
	 */
	public void setNomeModalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}
	/**
	 * @return the statusModalidade
	 */
	public Status getStatusModalidade() {
		return statusModalidade;
	}
	/**
	 * @param statusModalidade the statusModalidade to set
	 */
	public void setStatusModalidade(Status statusModalidade) {
		this.statusModalidade = statusModalidade;
	}
	
	
	
}
