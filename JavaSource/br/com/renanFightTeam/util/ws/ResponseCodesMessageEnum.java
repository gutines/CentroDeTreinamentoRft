package br.com.renanFightTeam.util.ws;

public enum ResponseCodesMessageEnum {

	RESPONSE_OK("Requisição efetuada com sucesso!"),
	RESPONSE_NOK("Requisição com erro na resposta!"),
	RESPONSE_TIMEOUT("Requisição excedeu o tempo de resposta!, Causa provável, sem conexao!");
	
	private String mensagem;
	
	private ResponseCodesMessageEnum(String mensagem) {
		this.setMensagem(mensagem);
	}

	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * @param mensagem the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	
	
}
