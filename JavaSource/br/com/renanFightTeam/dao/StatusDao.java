package br.com.renanFightTeam.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.renanFightTeam.model.Status;

public class StatusDao {
	
	private List<Status> status = new ArrayList<Status>();
	
	
	public StatusDao(){
		
		this.status.add(new Status(1, "Ativo"));
		this.status.add(new Status(2, "Inativo"));
		this.status.add(new Status(3, "Cancelado"));
		this.status.add(new Status(4, "no selection"));
		
		
	}
	
	
	
	public ArrayList<Status> listaStatus(){
		return (ArrayList<Status>) this.status;
	}
}
