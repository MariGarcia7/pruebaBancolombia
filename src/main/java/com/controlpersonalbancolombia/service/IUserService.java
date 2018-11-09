package com.controlpersonalbancolombia.service;

import java.util.List;

import com.controlpersonalbancolombia.model.Users;

public interface IUserService {
	
	Users ingresarUsuario(Users usuario);
	Users actualizarUsuario(Users usuario);
	Users eliminarUsuario(int id);
	List<Users> mostrarUsuarios();

}
