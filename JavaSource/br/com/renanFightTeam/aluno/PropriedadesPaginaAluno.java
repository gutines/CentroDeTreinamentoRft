package br.com.renanFightTeam.aluno;

import javax.faces.component.html.HtmlPanelGroup;

public class PropriedadesPaginaAluno {

	private HtmlPanelGroup painelDados;
	private HtmlPanelGroup painelEndereco;
	private HtmlPanelGroup painelContato;
	private HtmlPanelGroup painelMatricula;
	private HtmlPanelGroup painelConfirmar;
	
	
	public void validarFluxoPagina(String paginaAtual, String paginaSolicitada) {
		
		esconderPaginaAtual(paginaAtual);
		renderizarPaginaSolicitada(paginaSolicitada);
		
	}
	
	private void esconderPaginaAtual(String paginaAtual){
		
		if(paginaAtual.equals(painelDados.getId())){
			painelDados.setRendered(false);
			return;
		}
		
		if(paginaAtual.equals(painelEndereco.getId())){
			painelEndereco.setRendered(false);
			return;
		}
		
		if(paginaAtual.equals(painelContato.getId())){
			painelContato.setRendered(false);
			return;
		}
		
		if(paginaAtual.equals(painelMatricula.getId())){
			painelMatricula.setRendered(false);
			return;
		}
		
		if(paginaAtual.equals(painelConfirmar.getId())){
			painelConfirmar.setRendered(false);
			return;
		}
		
	}
	
	private void renderizarPaginaSolicitada(String paginaSolicitada){
		
		if(paginaSolicitada.equals(painelDados.getId())){
			painelDados.setRendered(true);
			return;
		}
		
		if(paginaSolicitada.equals(painelEndereco.getId())){
			painelEndereco.setRendered(true);
			return;
		}
		
		if(paginaSolicitada.equals(painelContato.getId())){
			painelContato.setRendered(true);
			return;
		}
		
		if(paginaSolicitada.equals(painelMatricula.getId())){
			painelMatricula.setRendered(true);
			return;
		}
		
		if(paginaSolicitada.equals(painelConfirmar.getId())){
			painelConfirmar.setRendered(true);
			return;
		}
	}


	/**
	 * @return the painelDados
	 */
	public HtmlPanelGroup getPainelDados() {
		return painelDados;
	}


	/**
	 * @param painelDados the painelDados to set
	 */
	public void setPainelDados(HtmlPanelGroup painelDados) {
		this.painelDados = painelDados;
	}


	/**
	 * @return the painelEndereco
	 */
	public HtmlPanelGroup getPainelEndereco() {
		return painelEndereco;
	}


	/**
	 * @param painelEndereco the painelEndereco to set
	 */
	public void setPainelEndereco(HtmlPanelGroup painelEndereco) {
		this.painelEndereco = painelEndereco;
	}


	/**
	 * @return the painelContato
	 */
	public HtmlPanelGroup getPainelContato() {
		return painelContato;
	}


	/**
	 * @param painelContato the painelContato to set
	 */
	public void setPainelContato(HtmlPanelGroup painelContato) {
		this.painelContato = painelContato;
	}


	/**
	 * @return the painelMatricula
	 */
	public HtmlPanelGroup getPainelMatricula() {
		return painelMatricula;
	}


	/**
	 * @param painelMatricula the painelMatricula to set
	 */
	public void setPainelMatricula(HtmlPanelGroup painelMatricula) {
		this.painelMatricula = painelMatricula;
	}


	/**
	 * @return the painelConfirmar
	 */
	public HtmlPanelGroup getPainelConfirmar() {
		return painelConfirmar;
	}


	/**
	 * @param painelConfirmar the painelConfirmar to set
	 */
	public void setPainelConfirmar(HtmlPanelGroup painelConfirmar) {
		this.painelConfirmar = painelConfirmar;
	}
	
	

}
