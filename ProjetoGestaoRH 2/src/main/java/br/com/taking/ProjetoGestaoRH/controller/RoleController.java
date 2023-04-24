package br.com.taking.ProjetoGestaoRH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Role;
import br.com.taking.ProjetoGestaoRH.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping(value= "/role", method = RequestMethod.GET)
	public ResponseEntity<List<Role>> GetALL(){
		
		List<Role> resultado = roleService.listarTodos();
		return new ResponseEntity<List<Role>> (resultado, HttpStatus.OK);
		
	}

}
