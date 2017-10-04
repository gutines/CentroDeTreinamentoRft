package br.com.renanFightTeam.model;

import java.io.Serializable;


public class Plano implements Serializable{
	
	private static final long serialVersionUID = 8609969974604517809L;
	
	private int codigoPlano;
	private String nomePlano;
	private Status statusPlano;
	private double valorMensalPlano;
	private int quantidadeMesesPlano;	
	
	public Plano(){
		
	}
	
	public Plano(int codigoPlano, String nomePlano, Status statusPlano,	double valorMensalPlano, int quantidadeMesesPlano) {
		this.codigoPlano = codigoPlano;
		this.nomePlano = nomePlano;
		this.statusPlano = statusPlano;
		this.valorMensalPlano = valorMensalPlano;
		this.quantidadeMesesPlano = quantidadeMesesPlano;
	}
	/**
	 * @return the codigoPlano
	 */
	public int getCodigoPlano() {
		return codigoPlano;
	}
	/**
	 * @param codigoPlao the codigoPlano to set
	 */
	public void setCodigoPlano(int codigoPlano) {
		this.codigoPlano = codigoPlano;
	}
	/**
	 * @return the nomePlano
	 */
	public String getNomePlano() {
		return nomePlano;
	}
	/**
	 * @param nomePlano the nomePlano to set
	 */
	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}
	
	/**
	 * @return the valorMensalPlano
	 */
	public double getValorMensalPlano() {
		return valorMensalPlano;
	}
	/**
	 * @param valorMensalPlano the valorMensalPlano to set
	 */
	public void setValorMensalPlano(double valorMensalPlano) {
		this.valorMensalPlano = valorMensalPlano;
	}
	/**
	 * @return the quantidadeMesesPlano
	 */
	public int getQuantidadeMesesPlano() {
		return quantidadeMesesPlano;
	}
	/**
	 * @param quantidadeMesesPlano the quantidadeMesesPlano to set
	 */
	public void setQuantidadeMesesPlano(int quantidadeMesesPlano) {
		this.quantidadeMesesPlano = quantidadeMesesPlano;
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
