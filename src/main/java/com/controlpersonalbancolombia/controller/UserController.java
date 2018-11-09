package com.controlpersonalbancolombia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.controlpersonalbancolombia.model.Users;
import com.controlpersonalbancolombia.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping (value = "/usuario/crear", method = RequestMethod.POST)
	private ResponseEntity<Users> ingresarUsuario(@RequestBody Users usuario){
		return new  ResponseEntity<>(userService.ingresarUsuario(usuario),HttpStatus.OK);
	}
	
	@RequestMapping (value = "/usuario/actualizar", method = RequestMethod.PUT)
	private ResponseEntity<Users> actualizarUsuario(@RequestBody Users usuario){
		return new  ResponseEntity<>(userService.actualizarUsuario(usuario),HttpStatus.OK);
	}
	
	@RequestMapping (value = "/usuario/listar", method = RequestMethod.GET)
	private ResponseEntity<List<Users>> listarUsuarios(){
		return new  ResponseEntity<List<Users>>(userService.mostrarUsuarios(),HttpStatus.OK);
	}
	


}
