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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoPlano;
		result = prime * result
				+ ((nomePlano == null) ? 0 : nomePlano.hashCode());
		result = prime * result + quantidadeMesesPlano;
		result = prime * result
				+ ((statusPlano == null) ? 0 : statusPlano.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorMensalPlano);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Plano other = (Plano) obj;
		if (codigoPlano != other.codigoPlano) {
			return false;
		}
		if (nomePlano == null) {
			if (other.nomePlano != null) {
				return false;
			}
		} else if (!nomePlano.equals(other.nomePlano)) {
			return false;
		}
		if (quantidadeMesesPlano != other.quantidadeMesesPlano) {
			return false;
		}
		if (statusPlano == null) {
			if (other.statusPlano != null) {
				return false;
			}
		} else if (!statusPlano.equals(other.statusPlano)) {
			return false;
		}
		if (Double.doubleToLongBits(valorMensalPlano) != Double
				.doubleToLongBits(other.valorMensalPlano)) {
			return false;
		}
		return true;
	}

	
	
	

}
