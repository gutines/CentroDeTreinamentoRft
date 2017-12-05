package br.com.renanFightTeam.converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.renanFightTeam.dao.ModalidadeDao;
import br.com.renanFightTeam.model.Modalidade;

@FacesConverter(value="modalidadeConverter", forClass=Modalidade.class)
public class ModalidadeConverter implements Converter{

	private Map<String, Modalidade> modalidade = new HashMap<String, Modalidade>();	
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		carregaMapa();
		
		return modalidade.get(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
				
		return ((Modalidade) value).getNomeModalidade();
	}	
		
	/**
	 * @return the modalidade
	 */
	public Map<String, Modalidade> getmodalidade() {
		return modalidade;
	}

	private void carregaMapa(){
		
		List<Modalidade> modalidade = new ModalidadeDao().listarModalidade();
		
		for (Modalidade modalidadeAux : modalidade) {
			this.modalidade.put(modalidadeAux.getNomeModalidade(), modalidadeAux);
		}		
		
	}

}
