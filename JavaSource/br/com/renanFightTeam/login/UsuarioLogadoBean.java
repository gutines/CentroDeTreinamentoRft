package br.com.renanFightTeam.login;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.renanFightTeam.model.Usuario;


@ManagedBean
@SessionScoped
public class UsuarioLogadoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario = new Usuario();

	public void logar(Usuario usuario) {
		this.usuario = usuario;	
	}

	public void deslogar() {
		liberarUsuarioLogado();
		this.usuario = new Usuario();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isLogado() {
		if(usuario != null){
			return true;
		}
		return false;
		
	}
	
	private void liberarUsuarioLogado(){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();	
		sessionMap.put("UsuarioLogadoBean", null);	
	}

}
