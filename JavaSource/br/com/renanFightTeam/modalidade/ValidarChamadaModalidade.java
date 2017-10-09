package br.com.renanFightTeam.modalidade;

import javax.faces.context.FacesContext;

import br.com.renanFightTeam.plano.PropriedadesPlano;
import br.com.renanFightTeam.util.PaginasEnum;
import br.com.renanFightTeam.util.ValidarChamada;

public class ValidarChamadaModalidade implements ValidarChamada{
	
	/**
	 * @return {@link PropriedadesPlano}
	 */
	public PropriedadesModalidade validaDesabilitarCampos(String opcao){
				
		// Desabilitar todos os campos da pagina
		if((opcao.equals(PaginasEnum.MODALIDADECONSULTAR.getPagina())) 
				|| (opcao.equals(PaginasEnum.MODALIDADEEXCLUIR.getPagina()))){
			return desabilitarTodosOsCampos();
			
		}else{
            // Desabilita apenas campo código.
			if((opcao.equals(PaginasEnum.MODALIDADEALTERAR.getPagina()))
					|| (opcao.equals(PaginasEnum.MODALIDADEINCLUIR.getPagina()))){
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
	
	private PropriedadesModalidade desabiliarNenhumCampo() {		
		return new PropriedadesModalidade(false, false, false);
	}

	private PropriedadesModalidade desabilitarId() {		
		return new PropriedadesModalidade(true, false, false);
	}

	private PropriedadesModalidade desabilitarTodosOsCampos() {		
		return new PropriedadesModalidade(true, true, true);
	}


}
