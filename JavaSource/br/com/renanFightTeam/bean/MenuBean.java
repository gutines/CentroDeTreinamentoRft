package br.com.renanFightTeam.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class MenuBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer index=0;
	
	public Integer getIndex() {
		return index;
	}
	
	public void setIndex(Integer index) {
		this.index = index;
	}
	
	public String paginaMenu() {
		this.index = 0;
		return "resources/menu?faces-redirect=true";
	}
	
	public String paginaAutores() {
		this.index = 1;
		return "autores?faces-redirect=true";
	}

	public String paginaLogin() {
		this.index = 0;
		return "login?faces-redirect=true";
	}
}
