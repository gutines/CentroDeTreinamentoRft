package br.com.renanFightTeam.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.renanFightTeam.model.Plano;
import br.com.renanFightTeam.model.Status;

public class PlanoDao {
	
	private List<Plano> planos = new ArrayList<Plano>();
	
	public PlanoDao(){
		planos.add(new Plano(1, "Mensal", new Status(1, "Ativo"), 100.00, 1));
		planos.add(new Plano(2, "Semestral", new Status(1, "Ativo"), 100.00, 6));
		planos.add(new Plano(3, "Anual", new Status(1, "Ativo"), 100.00, 12));
	}

	public void incluirPlano(Plano plano){
		
	}
	
	public int obterProximoCodigoPlano(){
		
		return 1;
	}
	
	
	public ArrayList<Plano> listarPlano(){
							
		return (ArrayList<Plano>) planos;
	}

	public List<Plano> buscaPorCodigo(int codigo) {
		List<Plano> resultadoLista = new ArrayList<Plano>();
		
		for (Plano plano : planos) {
			if(plano.getCodigoPlano() == codigo){
				resultadoLista.add(plano);
			}
		}
		
		return resultadoLista;
	}

	public List<Plano> buscarPorNome(String nome) {
		List<Plano> resultadoLista = new ArrayList<Plano>();
		
		for (Plano plano : planos) {
			if(plano.getNomePlano().contains(nome)){
				resultadoLista.add(plano);
			}
		}
		
		return resultadoLista;
	}

	public List<Plano> buscarPorStatus(String status) {
		List<Plano> resultadoLista = new ArrayList<Plano>();
		
		for (Plano plano : planos) {
			if(plano.getStatusPlano().getStatus().equals(status)){
				resultadoLista.add(plano);
			}
		}
		
		return resultadoLista;
	}
		
}
