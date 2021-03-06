package br.com.renanFightTeam.login;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.renanFightTeam.dao.UsuarioDao;
import br.com.renanFightTeam.model.Usuario;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	private static final long serialVersionUID = 3431061882896193043L;
	
	private Usuario usuario = new Usuario();		
	private UsuarioDao dao = new UsuarioDao();	

	private UsuarioLogadoBean usuarioLogadoBean;
	
	private String mensagem;
	
	@PostConstruct
	public void init(){
		usuarioLogadoBean = new UsuarioLogadoBean();
		
	}
	
	/**
	 * @return the mensagem
	 */
	 public String getMensagem() {
		return mensagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	//Validar Login
	public String efetuaLogin(){
		
		Usuario userFound = this.dao.findByUser(usuario.getUser());
		
		if(userFound!= null && isSamePassword(userFound)){
			usuarioLogadoBean.logar(userFound);
			gravarBean();
			return "resources/home?faces-redirect=true";
		}
		
		criaMensagem("Usuario n�o encontrado!");
		limparForm();
		return "";
	}
	
	private void gravarBean(){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();
		
		sessionMap.put("UsuarioLogadoBean", usuarioLogadoBean);
	}
	

	public String efetuaLogout() {
		this.usuarioLogadoBean.deslogar();
		return "/index?faces-redirect=true";
	}

	
	private void limparForm() {
		this.usuario = new Usuario();
	}

	private void criaMensagem(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, ""));
	}

	private boolean isSamePassword(Usuario userFound) {		
		return userFound.getPassword().equals(usuario.getPassword());
	}
	

}
