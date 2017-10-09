package br.com.renanFightTeam.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.renanFightTeam.model.Modalidade;
import br.com.renanFightTeam.model.Plano;
import br.com.renanFightTeam.model.Status;

public class ModalidadeDao {
	
	private List<Modalidade> modalidades = new ArrayList<Modalidade>();
	
	public ModalidadeDao(){
		modalidades.add(new Modalidade(1, "Jiu Jitsu", new Status(1, "Ativo")));
		modalidades.add(new Modalidade(2, "Muay Thai", new Status(1, "Ativo")));
		modalidades.add(new Modalidade(3, "Boxe", new Status(1, "Ativo")));
	}

	public void incluirPlano(Plano plano){
		
	}
	
	public int obterProximoCodigoModalidade(){	
		//TODO Retornar próximo código do plano.
		return 1; 
	}
	
	
	public ArrayList<Modalidade> listarPlano(){
							
		return (ArrayList<Modalidade>) modalidades;
	}

	public List<Modalidade> buscaPorCodigo(int codigo) {
		List<Modalidade> resultadoLista = new ArrayList<Modalidade>();
		
		for (Modalidade modalidade : modalidades) {
			if(modalidade.getCodigoModalidade() == codigo){
				resultadoLista.add(modalidade);
			}
		}
		
		return resultadoLista;
	}

	public List<Modalidade> buscarPorNome(String nome) {
		List<Modalidade> resultadoLista = new ArrayList<Modalidade>();
		
		for (Modalidade modalidade : modalidades) {
			if(modalidade.getNomeModalidade().contains(nome)){
				resultadoLista.add(modalidade);
			}
		}
		
		return resultadoLista;
	}

	public List<Modalidade> buscarPorStatus(String status) {
		List<Modalidade> resultadoLista = new ArrayList<Modalidade>();
		
		for (Modalidade modalidade : modalidades) {
			if(modalidade.getStatusModalidade().getStatus().equals(status)){
				resultadoLista.add(modalidade);
			}
		}
		
		return resultadoLista;
	}
		
}
