package br.com.renanFightTeam.endereco;

import java.util.concurrent.TimeoutException;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.apache.http.HttpException;

import br.com.renanFightTeam.model.Endereco;
import br.com.renanFightTeam.util.ws.ViaCep;

public class EnderecoBean {
	Endereco endereco;
	
	public EnderecoBean(){
		endereco = new Endereco();
	}

	public void validarCep(FacesContext fc, UIComponent component, Object value)throws ValidatorException{
		String cep = value.toString();
		
		if (!cep.matches("\\d{8}")) {
			throw new ValidatorException(new FacesMessage("Cep inválido, verifique as informaçõe e tente novamente!"));
        }
	}
	
	public void obterEndereco(){
		ViaCep viaCep = new ViaCep();
		
		Endereco enderecoAux;

		try {
			enderecoAux = viaCep.getEnderecoPorCep(endereco.getCep());
		
			if (!(enderecoAux == null)) {
				carregarEndereco(enderecoAux);
			}else{
				showMessage(viaCep.getMensagem());
			}
			
		} catch (Exception e){
			showMessage(viaCep.getMensagem());
		}
	}
	
	private void showMessage(String mensagem){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
	}
	
	
	private void carregarEndereco(Endereco enderecoAux){
		endereco.setEndereco(enderecoAux.getEndereco());
		endereco.setBairro(enderecoAux.getBairro());
		endereco.setCidade(enderecoAux.getCidade());
		endereco.setEstado(enderecoAux.getEstado());		
	}
	
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
