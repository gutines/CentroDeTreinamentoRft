package br.com.renanFightTeam.util.ws;

public enum ResponseCodesMessageEnum {

	RESPONSE_OK("Requisi��o efetuada com sucesso!"),
	RESPONSE_NOK("Requisi��o com erro na resposta!"),
	RESPONSE_TIMEOUT("Requisi��o excedeu o tempo de resposta!, Causa prov�vel, sem conexao!");
	
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
