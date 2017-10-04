package br.com.renanFightTeam.util;

import java.io.Serializable;
import java.util.List;

import br.com.renanFightTeam.dao.StatusDao;
import br.com.renanFightTeam.model.Status;

public class StatusUtil implements Serializable{

	private static final long serialVersionUID = 6070942099562982496L;

	private List<Status> statusLista;
	
	
	public StatusUtil(){
		StatusDao dao = new StatusDao();
		
		statusLista = dao.listaStatus();
	}
	
	/**
	 * @return the statusLista
	 */
	public List<Status> getStatusLista() {
		return statusLista;
	}

	/**
	 * @param statusLista the statusLista to set
	 */
	public void setStatusLista(List<Status> statusLista) {
		this.statusLista = statusLista;
	}
	
	
}
