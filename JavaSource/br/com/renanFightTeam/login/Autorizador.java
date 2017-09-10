package br.com.renanFightTeam.login;

import java.util.Map;

import javax.el.ELContext;
import javax.el.ELResolver;
import javax.faces.application.Application;
import javax.faces.application.NavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.inject.Inject;

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
	
	private Object getBeanController(FacesContext context, String managedBean) { //string é o nome registrado no faces-config.xml
        return context.getELContext().getELResolver().getValue(context.getELContext(), null, managedBean);
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

}
