package br.com.renanFightTeam.dao;

import br.com.renanFightTeam.model.Usuario;


public class UsuarioDao {
	
	
	public Usuario findByUser(String user) {
		if(user.equals("Augusto")){
			Usuario usuario = new Usuario();
			usuario.setUser(user);
			usuario.setPassword("123456");
			return usuario;
		}
		return new Usuario();
	}

}
