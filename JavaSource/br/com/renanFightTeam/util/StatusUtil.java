package br.com.renanFightTeam.util;

import java.io.Serializable;
import java.util.List;

import org.primefaces.push.annotation.Singleton;

import br.com.renanFightTeam.dao.StatusDao;
import br.com.renanFightTeam.model.Status;

@Singleton
public class StatusUtil implements Serializable{

	private static final long serialVersionUID = 6070942099562982496L;

	private List<Status> statusLista;
	
	public StatusUtil(){
		statusLista = new StatusDao().listaStatus();
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
