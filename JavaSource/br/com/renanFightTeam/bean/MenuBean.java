package br.com.renanFightTeam.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


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
		return "/resources/home?faces-redirect=true";
	}
	
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

	public String paginaLogin() {
		this.index = 0;
		return "/index?faces-redirect=true";
	}
}
