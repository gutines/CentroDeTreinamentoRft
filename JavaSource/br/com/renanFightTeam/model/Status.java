package br.com.renanFightTeam.model;

import java.io.Serializable;

public class Status implements Serializable{
	
	private static final long serialVersionUID = 777341524058586349L;
	
	private int idStatus;
	private String status;
		
	public Status(int idStatus, String status){
		this.idStatus = idStatus;
		this.status = status;
	}
	
	/**
	 * @return the idStatus
	 */
	public int getIdStatus() {
		return idStatus;
	}
	/**
	 * @param idStatus the idStatus to set
	 */
	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idStatus;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Status other = (Status) obj;
		if (idStatus != other.idStatus) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		return true;
	}
	
	
	
	
	

}
