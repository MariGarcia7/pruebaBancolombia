package com.controlpersonalbancolombia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlpersonalbancolombia.model.Users;
import com.controlpersonalbancolombia.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public Users ingresarUsuario(Users usuario) {
		
		return userRepository.save(usuario);
	}

	@Override
	public List<Users> mostrarUsuarios() {
		
		return userRepository.findAll();
	}

	@Override
	public Users actualizarUsuario(Users usuario) {
		
		return userRepository.saveAndFlush(usuario);
	}

	@Override
	public Users eliminarUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
