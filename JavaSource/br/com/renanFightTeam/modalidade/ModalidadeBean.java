package br.com.renanFightTeam.modalidade;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.renanFightTeam.bean.MenuBean;
import br.com.renanFightTeam.dao.ModalidadeDao;
import br.com.renanFightTeam.model.Modalidade;
import br.com.renanFightTeam.util.PaginasEnum;
import br.com.renanFightTeam.util.StatusUtil;

@ViewScoped
@ManagedBean
public class ModalidadeBean implements Serializable {

	
	private static final long serialVersionUID = -6448204227795709252L;
	
	private Modalidade modalidade;
	private StatusUtil status;
	private PropriedadesModalidade propriedadesModalidade;	
	
	/**
	 * 
	 */
	@PostConstruct
	public void init(){
		status = new StatusUtil();
		tratarCargaInicialPagina();
	}	
	
	/**
	 * 
	 */
	private void tratarCargaInicialPagina() {
		
		if(FacesContext.getCurrentInstance().getViewRoot().getViewId().endsWith(PaginasEnum.MODALIDADEINCLUIR.getPagina())){
			carregarInclusao();
		}else{
			String opcao = carregarOpcao();
			if(opcao.endsWith(PaginasEnum.MODALIDADECONSULTAR.getPagina())){
				carregarConsulta();
			}else{
				if(opcao.endsWith(PaginasEnum.MODALIDADEALTERAR.getPagina())){
					carregarAlteracao();
				}else{
					carregarExcluir();
				}
			}				
			carregarModalidade();			
		}
		
	}
	
	/**
	 * 
	 */
	private void carregarInclusao() {
		limpaTela();
		setPropriedadesModalidade(new ValidarChamadaModalidade().validaDesabilitarCampos(PaginasEnum.MODALIDADEINCLUIR.getPagina()));
		modalidade.setCodigoModalidade(new ModalidadeDao().obterProximoCodigoModalidade());
	}
	
	/**
	 * 
	 */
	private void carregarConsulta() {
		limpaTela();
		setPropriedadesModalidade(new ValidarChamadaModalidade().validaDesabilitarCampos(PaginasEnum.MODALIDADECONSULTAR.getPagina()));
	}
	
	/**
	 * 
	 */
	private void carregarAlteracao(){
		limpaTela();
		setPropriedadesModalidade(new ValidarChamadaModalidade().validaDesabilitarCampos(PaginasEnum.MODALIDADEALTERAR.getPagina()));
	}
	
	/**
	 * 
	 */
	private void carregarExcluir(){
		limpaTela();
		setPropriedadesModalidade(new ValidarChamadaModalidade().validaDesabilitarCampos(PaginasEnum.MODALIDADEEXCLUIR.getPagina()));
	}
	
	
	/**
	 * 
	 */
	private void limpaTela(){
		modalidade = new Modalidade();
		setPropriedadesModalidade(new PropriedadesModalidade());
	}

	/**
	 * 
	 * @return
	 */
	private String carregarOpcao(){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();	
		return (String) sessionMap.get("opcaoFiltroModalidade");	
	}
	
	/**
	 * 
	 */
	private void carregarModalidade(){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();	
		this.modalidade = (Modalidade) sessionMap.get("modalidade");	
	}

	/**
	 * 
	 * @return
	 */
	public String incluirModalidade() {				
		criaMensagem("Modalidade " + modalidade.getNomeModalidade() + " incluido com sucesso!");		
		return retornarHome();		
	}
	
	/**
	 * 
	 * @return
	 */
	public String alterarModalidade(){		
		criaMensagem("Modalidade " + modalidade.getNomeModalidade() + " alterado com sucesso!");		
		return retornarHome();
	}
	
	/**
	 * 
	 * @return
	 */
	public String excluirModalidade(){
		criaMensagem("Modalidade " + modalidade.getNomeModalidade() + " excluido com sucesso!");		
		return retornarHome();
	}
	
	/**
	 * 
	 * @return
	 */
	private String retornarHome(){		
		return new MenuBean().paginaHome();
	}


	

	/**
	 * @return the modalidade
	 */
	public Modalidade getModalidade() {
		return modalidade;
	}

	/**
	 * @param modalidade the modalidade to set
	 */
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	
	/**
	 * @return the status
	 */
	public StatusUtil getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusUtil status) {
		this.status = status;
	}

	/**
	 * @return the propriedadesModalidade
	 */
	public PropriedadesModalidade getPropriedadesModalidade() {
		return propriedadesModalidade;
	}

	/**
	 * @param propriedadesModalidade the propriedadesModalidade to set
	 */
	public void setPropriedadesModalidade(PropriedadesModalidade propriedadesModalidade) {
		this.propriedadesModalidade = propriedadesModalidade;
	}
	
	/**
	 * 
	 * @param mensagem
	 */
	private void criaMensagem(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, ""));		
		System.out.println(mensagem);
	}
}
