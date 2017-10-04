package br.com.renanFightTeam.plano;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;

public enum MensagemPlanoEnum {
	
	RESULTADO_NAO_ENCONTRADO(FacesMessage.SEVERITY_INFO, "Dados não encontrados.", "Dados da pesquisa não encontrados!");
	
	private Severity severidade;
	private String resumo;
	private String descricao;
	
	private MensagemPlanoEnum(Severity severidade, String resumo,
			String descricao) {
		this.severidade = severidade;
		this.resumo = resumo;
		this.descricao = descricao;
	}

	/**
	 * @return the severidade
	 */
	public Severity getSeveridade() {
		return severidade;
	}

	/**
	 * @param severidade the severidade to set
	 */
	public void setSeveridade(Severity severidade) {
		this.severidade = severidade;
	}

	/**
	 * @return the resumo
	 */
	public String getResumo() {
		return resumo;
	}

	/**
	 * @param resumo the resumo to set
	 */
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
