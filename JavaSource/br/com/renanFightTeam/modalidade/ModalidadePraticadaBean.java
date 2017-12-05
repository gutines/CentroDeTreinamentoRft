package br.com.renanFightTeam.modalidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.renanFightTeam.dao.ModalidadeDao;
import br.com.renanFightTeam.model.Modalidade;

public class ModalidadePraticadaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Modalidade> listaModalidades;
	private List<Modalidade> modalidadesSelecionadas;
	
	public ModalidadePraticadaBean(){
		listaModalidades = new ModalidadeDao().listarModalidade();
		modalidadesSelecionadas = new ArrayList<Modalidade>();
	}

	/**
	 * @return the listaModalidades
	 */
	public List<Modalidade> getListaModalidades() {
		return listaModalidades;
	}

	/**
	 * @param listaModalidades the listaModalidades to set
	 */
	public void setListaModalidades(List<Modalidade> listaModalidades) {
		this.listaModalidades = listaModalidades;
	}

	/**
	 * @return the modalidadesSelecionadas
	 */
	public List<Modalidade> getModalidadesSelecionadas() {
		return modalidadesSelecionadas;
	}

	/**
	 * @param modalidadesSelecionadas the modalidadesSelecionadas to set
	 */
	public void setModalidadesSelecionadas(List<Modalidade> modalidadesSelecionadas) {
		this.modalidadesSelecionadas = modalidadesSelecionadas;
	}
	
	
}
