package br.com.renanFightTeam.plano;

import javax.faces.context.FacesContext;

import br.com.renanFightTeam.util.PaginasEnum;
import br.com.renanFightTeam.util.ValidarChamada;

public class ValidarChamadaPlano implements ValidarChamada{
	
	/**
	 * @return {@link PropriedadesPlano}
	 */
	public PropriedadesPlano validaDesabilitarCampos(String opcao){
				
		// Desabilitar todos os campos da pagina
		if((opcao.equals(PaginasEnum.PLANOCONSULTAR.getPagina())) 
				|| (opcao.equals(PaginasEnum.PLANOEXCLUIR.getPagina()))){
			return desabilitarTodosOsCampos();
			
		}else{
            // Desabilita apenas campo código.
			if((opcao.equals(PaginasEnum.PLANOALTERAR.getPagina()))
					|| (opcao.equals(PaginasEnum.PLANOINCLUIR.getPagina()))){
				return desabilitarId();
			}else{
				return desabiliarNenhumCampo();
			}
				
		}
	}
	
	public boolean validaPaginaInclusao(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		if(context.getViewRoot().getViewId().endsWith(PaginasEnum.PLANOINCLUIR.getPagina())){
			return true;
		}
		
		return false;
	}
	
	private PropriedadesPlano desabiliarNenhumCampo() {		
		return new PropriedadesPlano(false, false, false, false, false);
	}

	private PropriedadesPlano desabilitarId() {		
		return new PropriedadesPlano(true, false, false, false, false);
	}

	private PropriedadesPlano desabilitarTodosOsCampos() {		
		return new PropriedadesPlano(true, true, true, true, true);
	}


	
}
