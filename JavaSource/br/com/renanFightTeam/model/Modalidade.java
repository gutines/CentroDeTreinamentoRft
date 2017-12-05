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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoModalidade;
		result = prime * result
				+ ((nomeModalidade == null) ? 0 : nomeModalidade.hashCode());
		result = prime
				* result
				+ ((statusModalidade == null) ? 0 : statusModalidade.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Modalidade other = (Modalidade) obj;
		if (codigoModalidade != other.codigoModalidade) {
			return false;
		}
		if (nomeModalidade == null) {
			if (other.nomeModalidade != null) {
				return false;
			}
		} else if (!nomeModalidade.equals(other.nomeModalidade)) {
			return false;
		}
		if (statusModalidade == null) {
			if (other.statusModalidade != null) {
				return false;
			}
		} else if (!statusModalidade.equals(other.statusModalidade)) {
			return false;
		}
		return true;
	}
	
	
	
}
