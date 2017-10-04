package br.com.renanFightTeam.plano;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.renanFightTeam.bean.MenuBean;
import br.com.renanFightTeam.dao.PlanoDao;
import br.com.renanFightTeam.login.UsuarioLogadoBean;
import br.com.renanFightTeam.model.Plano;
import br.com.renanFightTeam.util.PaginasEnum;
import br.com.renanFightTeam.util.StatusUtil;

@ViewScoped
@ManagedBean
public class PlanoBean implements Serializable{

	private static final long serialVersionUID = 5317190047925851932L;	
	
	private Plano plano;
	private StatusUtil status;	
	private PropriedadesPlano propriedadesPlano;	
		
	@PostConstruct
	public void init(){
		status = new StatusUtil();		
		
		tratarCargaInicialPagina();
	}
		
	private void tratarCargaInicialPagina() {
		
		if(FacesContext.getCurrentInstance().getViewRoot().getViewId().endsWith(PaginasEnum.PLANOINCLUIR.getPagina())){
			carregarInclusao();
		}else{
			String opcao = carregarOpcao();
			if(opcao.endsWith(PaginasEnum.PLANOCONSULTAR.getPagina())){
				carregarConsulta();
			}else{
				if(opcao.endsWith(PaginasEnum.PLANOALTERAR.getPagina())){
					carregarAlteracao();
				}else{
					carregarExcluir();
				}
			}				
			carregarPlano();			
		}
		
	}	

	private void carregarInclusao() {
		limpaTela();
		setPropriedadesPlano(new ValidarChamadaPlano().validaDesabilitarCampos(PaginasEnum.PLANOINCLUIR.getPagina()));
		plano.setCodigoPlano(new PlanoDao().obterProximoCodigoPlano());
	}
	
	private void carregarConsulta() {
		limpaTela();
		setPropriedadesPlano(new ValidarChamadaPlano().validaDesabilitarCampos(PaginasEnum.PLANOCONSULTAR.getPagina()));
	}
	
	private void carregarAlteracao(){
		limpaTela();
		setPropriedadesPlano(new ValidarChamadaPlano().validaDesabilitarCampos(PaginasEnum.PLANOALTERAR.getPagina()));
	}
	
	private void carregarExcluir(){
		limpaTela();
		setPropriedadesPlano(new ValidarChamadaPlano().validaDesabilitarCampos(PaginasEnum.PLANOEXCLUIR.getPagina()));
	}
		
	private void limpaTela(){
		plano = new Plano();
		propriedadesPlano = new PropriedadesPlano();
	}
	
	private String carregarOpcao(){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();	
		return (String) sessionMap.get("opcaoFiltroPlano");	
	}
	
	private void carregarPlano(){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();	
		this.plano = (Plano) sessionMap.get("plano");	
	}
		

	public String incluirPlano() {				
		criaMensagem("Plano " + plano.getNomePlano() + " incluido com sucesso!");		
		return retornarHome();		
	}
	
	public String alterarPlano(){		
		criaMensagem("Plano " + plano.getNomePlano() + " alterado com sucesso!");		
		return retornarHome();
	}
	
	public String excluirPlano(){
		criaMensagem("Plano " + plano.getNomePlano() + " excluido com sucesso!");		
		return retornarHome();
	}
	
	private String retornarHome(){		
		return new MenuBean().paginaHome();
	}

	/**
	 * @return the plano
	 */
	public Plano getPlano() {
		return plano;
	}

	/**
	 * @param plano the plano to set
	 */
	public void setPlano(Plano plano) {
		this.plano = plano;
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
	 * @return the propriedadesPlano
	 */
	public PropriedadesPlano getPropriedadesPlano() {
		return propriedadesPlano;
	}

	/**
	 * @param propriedadesPlano the propriedadesPlano to set
	 */
	public void setPropriedadesPlano(PropriedadesPlano propriedadesPlano) {
		this.propriedadesPlano = propriedadesPlano;
	}

	private void criaMensagem(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, ""));		
		System.out.println(mensagem);
	}
	
}
