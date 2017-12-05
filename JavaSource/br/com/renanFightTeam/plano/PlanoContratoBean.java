package br.com.renanFightTeam.plano;

import java.io.Serializable;
import java.util.List;

import br.com.renanFightTeam.dao.PlanoDao;
import br.com.renanFightTeam.model.Plano;


public class PlanoContratoBean implements Serializable {
	
	private static final long serialVersionUID = 3814498319269501252L;
	
	private PlanoContrato planoContrato;
	private List<Plano> listaPlanos;
	private Plano planoSelecionado;
	
	public PlanoContratoBean(){
		listaPlanos = new PlanoDao().listarPlano();
	}

	/**
	 * @return the planoContrato
	 */
	public PlanoContrato getPlanoContrato() {
		return planoContrato;
	}

	/**
	 * @param planoContrato the planoContrato to set
	 */
	public void setPlanoContrato(PlanoContrato planoContrato) {
		this.planoContrato = planoContrato;
	}

	/**
	 * @return the listaPlanos
	 */
	public List<Plano> getListaPlanos() {
		return listaPlanos;
	}

	/**
	 * @param listaPlanos the listaPlanos to set
	 */
	public void setListaPlanos(List<Plano> listaPlanos) {
		this.listaPlanos = listaPlanos;
	}

	/**
	 * @return the planoSelecionado
	 */
	public Plano getPlanoSelecionado() {
		return planoSelecionado;
	}

	/**
	 * @param planoSelecionado the planoSelecionado to set
	 */
	public void setPlanoSelecionado(Plano planoSelecionado) {
		this.planoSelecionado = planoSelecionado;
	}
		
	
	
}
