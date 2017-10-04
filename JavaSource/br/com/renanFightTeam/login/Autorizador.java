package br.com.renanFightTeam.login;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class Autorizador implements PhaseListener{
	
	private static final long serialVersionUID = 1L;
		
	public void afterPhase(PhaseEvent event) {

		FacesContext context = event.getFacesContext();
		
		if ("/index.xhtml".equals(context.getViewRoot().getViewId())) {
			return;
		}				
		
		UsuarioLogadoBean usuarioLogado = recuperarUsuarioLogado();
		
		if (usuarioLogado == null) {
						
			NavigationHandler handler = context.getApplication().getNavigationHandler();
			handler.handleNavigation(context, null, "/index?faces-redirect=true");
			
			//efetua renderizacao da tela
			context.renderResponse();			
		}
	}	
	
	@Override
	public void beforePhase(PhaseEvent event) {
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}
	
	private UsuarioLogadoBean recuperarUsuarioLogado(){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();	
		return (UsuarioLogadoBean) sessionMap.get("UsuarioLogadoBean");		
		 
	}
	
	private void criaMensagem(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, ""));
	}
	

}
