package br.com.renanFightTeam.modalidade;

public class PropriedadesModalidade {
	
	private boolean desabilitarId;
	private boolean desabilitarNome;
	private boolean desabilitarStatus;
	
	/**
	 * 
	 */
	public PropriedadesModalidade(){
		
	}
	
	/** 	
	 * @param desabilitarId
	 * @param desabilitarNome
	 * @param desabilitarStatus
	 */
	public PropriedadesModalidade(boolean desabilitarId,
			boolean desabilitarNome, boolean desabilitarStatus) {
		super();
		this.desabilitarId = desabilitarId;
		this.desabilitarNome = desabilitarNome;
		this.desabilitarStatus = desabilitarStatus;
	}



	/**
	 * @return the desabilitarId
	 */
	public boolean isDesabilitarId() {
		return desabilitarId;
	}
	/**
	 * @param desabilitarId the desabilitarId to set
	 */
	public void setDesabilitarId(boolean desabilitarId) {
		this.desabilitarId = desabilitarId;
	}
	/**
	 * @return the desabilitarNome
	 */
	public boolean isDesabilitarNome() {
		return desabilitarNome;
	}
	/**
	 * @param desabilitarNome the desabilitarNome to set
	 */
	public void setDesabilitarNome(boolean desabilitarNome) {
		this.desabilitarNome = desabilitarNome;
	}
	/**
	 * @return the desabilitarStatus
	 */
	public boolean isDesabilitarStatus() {
		return desabilitarStatus;
	}
	/**
	 * @param desabilitarStatus the desabilitarStatus to set
	 */
	public void setDesabilitarStatus(boolean desabilitarStatus) {
		this.desabilitarStatus = desabilitarStatus;
	}
	
	
}
