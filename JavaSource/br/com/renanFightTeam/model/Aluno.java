package br.com.renanFightTeam.model;

import java.util.Calendar;
import java.util.Date;

public class Aluno {
	
	private String nome;
	private Calendar dataDeNascimento = Calendar.getInstance();
	private String rg;
	private String cpf;
	private String telefone;
	private String telefoneDeEmergencia;
	private String contatoDeEmergencia;
	private String email;
	private int codigoFoto;
	private boolean atestadoMedico;
	private Status statusAluno;
	
		
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the dataDeNascimento
	 */
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}
	/**
	 * @param dataDeNascimento the dataDeNascimento to set
	 */
	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
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
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the telefoneDeEmergencia
	 */
	public String getTelefoneDeEmergencia() {
		return telefoneDeEmergencia;
	}
	/**
	 * @param telefoneDeEmergencia the telefoneDeEmergencia to set
	 */
	public void setTelefoneDeEmergencia(String telefoneDeEmergencia) {
		this.telefoneDeEmergencia = telefoneDeEmergencia;
	}
	/**
	 * @return the contatoDeEmergencia
	 */
	public String getContatoDeEmergencia() {
		return contatoDeEmergencia;
	}
	/**
	 * @param contatoDeEmergencia the contatoDeEmergencia to set
	 */
	public void setContatoDeEmergencia(String contatoDeEmergencia) {
		this.contatoDeEmergencia = contatoDeEmergencia;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the codigoFoto
	 */
	public int getCodigoFoto() {
		return codigoFoto;
	}
	/**
	 * @param codigoFoto the codigoFoto to set
	 */
	public void setCodigoFoto(int codigoFoto) {
		this.codigoFoto = codigoFoto;
	}
	/**
	 * @return the atestadoMedico
	 */
	public boolean isAtestadoMedico() {
		return atestadoMedico;
	}
	/**
	 * @param atestadoMedico the atestadoMedico to set
	 */
	public void setAtestadoMedico(boolean atestadoMedico) {
		this.atestadoMedico = atestadoMedico;
	}
	/**
	 * @return the statusAluno
	 */
	public Status getStatusAluno() {
		return statusAluno;
	}
	/**
	 * @param statusAluno the statusAluno to set
	 */
	public void setStatusAluno(Status statusAluno) {
		this.statusAluno = statusAluno;
	}
	
	

}
