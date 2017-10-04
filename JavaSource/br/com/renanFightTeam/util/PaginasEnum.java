package br.com.renanFightTeam.util;

public enum PaginasEnum {
	
	PLANOINCLUIR("/resources/pages/plano/planoincluir", "/resources/pages/plano/planoincluir.xhtml", "planoincluir.xhtml"),
	PLANOALTERAR("/resources/pages/plano/planoalterar", "/resources/pages/plano/planoalterar.xhtml", "planoalterar.xhtml"),
	PLANOCONSULTAR("/resources/pages/plano/planoconsultar", "/resources/pages/plano/planoconsultar.xhtml", "planoconsultar.xhtml"),
	PLANOEXCLUIR("/resources/pages/plano/planoexcluir", "/resources/pages/plano/planoexcluir.xhtml", "planoexcluir.xhtml");
	
	private final String diretorio;
	private final String diretorioCompleto;
	private final String pagina;
	
	private PaginasEnum(String diretorio, String diretorioCompleto,	String pagina) {
		this.diretorio = diretorio;
		this.diretorioCompleto = diretorioCompleto;
		this.pagina = pagina;
	}

	/**
	 * @return the diretorio
	 */
	public String getDiretorio() {
		return diretorio;
	}

	/**
	 * @return the diretorioCompleto
	 */
	public String getDiretorioCompleto() {
		return diretorioCompleto;
	}

	/**
	 * @return the pagina
	 */
	public String getPagina() {
		return pagina;
	}


	
}