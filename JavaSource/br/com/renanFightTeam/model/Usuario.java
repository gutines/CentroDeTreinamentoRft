package br.com.renanFightTeam.model;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class Usuario {
	
	private String user;
	private String password;
	
	public Usuario(){
		setUser("Augusto");
		setPassword("123456");
	}
	
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
