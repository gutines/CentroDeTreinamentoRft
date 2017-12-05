package br.com.renanFightTeam.plano;

import java.io.Serializable;
import java.util.Calendar;

import br.com.renanFightTeam.model.Status;

public class PlanoContrato implements Serializable{

	private static final long serialVersionUID = -6040364136093386437L;

	private String numeroContrato;
	private String cpf;
	private int codigoPlano;
	private double valorTotalPlano;
	private Calendar dataContratacao;
	private Calendar dataEncerramento;
	private Status statusPlano;
	/**
	 * @return the numeroContrato
	 */
	public String getNumeroContrato() {
		return numeroContrato;
	}
	/**
	 * @param numeroContrato the numeroContrato to set
	 */
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the codigoPlano
	 */
	public int getCodigoPlano() {
		return codigoPlano;
	}
	/**
	 * @param codigoPlano the codigoPlano to set
	 */
	public void setCodigoPlano(int codigoPlano) {
		this.codigoPlano = codigoPlano;
	}
	/**
	 * @return the valorTotalPlano
	 */
	public double getValorTotalPlano() {
		return valorTotalPlano;
	}
	/**
	 * @param valorTotalPlano the valorTotalPlano to set
	 */
	public void setValorTotalPlano(double valorTotalPlano) {
		this.valorTotalPlano = valorTotalPlano;
	}
	/**
	 * @return the dataContratacao
	 */
	public Calendar getDataContratacao() {
		return dataContratacao;
	}
	/**
	 * @param dataContratacao the dataContratacao to set
	 */
	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	/**
	 * @return the dataEncerramento
	 */
	public Calendar getDataEncerramento() {
		return dataEncerramento;
	}
	/**
	 * @param dataEncerramento the dataEncerramento to set
	 */
	public void setDataEncerramento(Calendar dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	/**
	 * @return the statusPlano
	 */
	public Status getStatusPlano() {
		return statusPlano;
	}
	/**
	 * @param statusPlano the statusPlano to set
	 */
	public void setStatusPlano(Status statusPlano) {
		this.statusPlano = statusPlano;
	}

}
