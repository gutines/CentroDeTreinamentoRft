package br.com.renanFightTeam.plano;

public class PropriedadesPlano {
	
	private boolean desabilitarId;
	private boolean desabilitarNome;
	private boolean desabilitarValorMensal;
	private boolean desabilitarQuantidadeMeses;
	private boolean desabilitarStatus;
		
	
	public PropriedadesPlano(){
		
	}
	
	public PropriedadesPlano(boolean desabilitarId, boolean desabilitarNome,
			boolean desabilitarValorMensal, boolean desabilitarQuantidadeMeses,
			boolean desabilitarStatus) {
		
		this.desabilitarId = desabilitarId;
		this.desabilitarNome = desabilitarNome;
		this.desabilitarValorMensal = desabilitarValorMensal;
		this.desabilitarQuantidadeMeses = desabilitarQuantidadeMeses;
		this.desabilitarStatus = desabilitarStatus;
	}
	/**
	 * @return the desabilitarId
	 */
	public boolean isDesabilitarId() {
		return desabilitarId;
	}
	/**
	 * @return the desabilitarNome
	 */
	public boolean isDesabilitarNome() {
		return desabilitarNome;
	}
	/**
	 * @return the desabilitarValorMensal
	 */
	public boolean isDesabilitarValorMensal() {
		return desabilitarValorMensal;
	}
	/**
	 * @return the desabilitarQuantidadeMeses
	 */
	public boolean isDesabilitarQuantidadeMeses() {
		return desabilitarQuantidadeMeses;
	}
	/**
	 * @return the desabilitarStatus
	 */
	public boolean isDesabilitarStatus() {
		return desabilitarStatus;
	}
	
	
		

}
