package br.com.renanFightTeam.converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.renanFightTeam.dao.StatusDao;
import br.com.renanFightTeam.model.Status;

@FacesConverter(value="statusConverter", forClass=Status.class)
public class StatusConverter implements Converter{

	private Map<String, Status> status = new HashMap<String, Status>();	
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		carregaMapa();
		
		return status.get(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
				
		return ((Status) value).getStatus();
	}	
		
	/**
	 * @return the status
	 */
	public Map<String, Status> getStatus() {
		return status;
	}

	private void carregaMapa(){
		StatusDao dao = new StatusDao();
		
		List<Status> status = dao.listaStatus();
		
		for (Status statusAux : status) {
			this.status.put(statusAux.getStatus(), statusAux);
		}		
		
	}

}
