package br.com.renanFightTeam.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class MenuBean implements Serializable{

	private static final long serialVersionUID = 9178218097400714533L;
	private Integer index=0;
	
	public Integer getIndex() {
		return index;
	}
	
	public void setIndex(Integer index) {
		this.index = index;
	}
	
	public String paginaHome() {
		this.index = 0;
		boolean flag = FacesContext.getCurrentInstance().getExternalContext().isResponseCommitted();
		if(!flag){
			return "/resources/home?faces-redirect=true";
		}
		return "";		
	}
	
	
	/*
	 * PLANO
	 */
	
	public String paginaPlanoIncluir(){
		this.index = 0;
		return "/resources/pages/plano/planoincluir?faces-redirect=true";
	}
	
	public String paginaPlanoConsultar(){
		this.index = 0;
		return "/resources/pages/plano/planoconsultar?faces-redirect=true";
	}
	
	public String paginaPlanoAlterar(){
		this.index = 0;
		return "/resources/pages/plano/planoalterar?faces-redirect=true";
	}
	
	public String paginaPlanoExcluir(){
		this.index = 0;
		return "/resources/pages/plano/planoexcluir?faces-redirect=true";
	}
	
	public String paginaPlanoFiltro(){
		this.index = 0;
		return "/resources/pages/plano/planofiltroform?faces-redirect=true";
	}
	
	/*
	 * MODALIDADE
	 */
	
	public String paginaModalidadeIncluir(){
		this.index = 0;
		return "/resources/pages/modalidade/modalidadeincluir?faces-redirect=true";
	}
	
	public String paginaModalidadeConsultar(){
		this.index = 0;
		return "/resources/pages/modalidade/modalidadeconsultar?faces-redirect=true";
	}
	
	public String paginaModalidadeAlterar(){
		this.index = 0;
		return "/resources/pages/modalidade/modalidadealterar?faces-redirect=true";
	}
	
	public String paginaModalidadeExcluir(){
		this.index = 0;
		return "/resources/pages/modalidade/modalidadeexcluir?faces-redirect=true";
	}
	
	public String paginaModalidadeFiltro(){
		this.index = 0;
		return "/resources/pages/modalidade/modalidadefiltroform?faces-redirect=true";
	}
	
	/*
	 * ALUNO
	 */
	
	public String paginaAlunoIncluir(){
		this.index = 0;
		return "/resources/pages/aluno/alunoincluir?faces-redirect=true";
	}
	 
	public String paginaLogin() {
		this.index = 0;
		return "/index?faces-redirect=true";
	}
}
