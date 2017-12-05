package br.com.renanFightTeam.converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.renanFightTeam.dao.PlanoDao;
import br.com.renanFightTeam.model.Plano;

@FacesConverter(value="planoConverter", forClass=Plano.class)
public class PlanoConverter implements Converter{

	private Map<String, Plano> plano = new HashMap<String, Plano>();	
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		carregaMapa();
		
		return plano.get(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
				
		return ((Plano) value).getNomePlano();
	}	
		
	/**
	 * @return the plano
	 */
	public Map<String, Plano> getPlano() {
		return plano;
	}

	private void carregaMapa(){
		
		List<Plano> plano = new PlanoDao().listarPlano();
		
		for (Plano planoAux : plano) {
			this.plano.put(planoAux.getNomePlano(), planoAux);
		}		
		
	}

}
