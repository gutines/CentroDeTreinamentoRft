package br.com.renanFightTeam.aluno;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

public class ValidarDadosAluno {
	
	String mensagem;
		
	public void validarRG(FacesContext fc, UIComponent component, Object value)throws ValidatorException{
		String rg = value.toString();
		
		if(!(possui9Digitos(rg))){
			apresentarMensagem();
		}
	}
	
	private void apresentarMensagem() {
		throw new ValidatorException(new FacesMessage(mensagem));
		
	}

	private boolean possui9Digitos(String rg) {		
		if(!(rg.length() == 9)){
			mensagem = "RG com tamanho inválido!";
			return false;
		}
		
		return true;
	}
	
	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}
}
