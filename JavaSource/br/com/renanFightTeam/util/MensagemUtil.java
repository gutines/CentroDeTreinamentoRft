package br.com.renanFightTeam.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MensagemUtil {
	
	public static void enviarMensagemInformativa(String mensagem) {
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
	}
	
	public static void enviarMensagemSucesso(String mensagem){
		
 		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
	}

}
