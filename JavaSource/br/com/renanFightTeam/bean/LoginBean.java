package br.com.renanFightTeam.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.event.NamedEvent;

import br.com.renanFightTeam.dao.UsuarioDao;
import br.com.renanFightTeam.login.UsuarioLogadoBean;
import br.com.renanFightTeam.model.Usuario;

@ManagedBean
public class LoginBean {
	
	private Usuario usuario = new Usuario();
	private UsuarioDao dao = new UsuarioDao();
	
	
	UsuarioLogadoBean usuarioLogado;
	
	@PostConstruct
	public void init(){
		
	}
	
	//Validar Login
	public void efetuaLogin(){
		System.out.println("Logou!");
	}
	

}
