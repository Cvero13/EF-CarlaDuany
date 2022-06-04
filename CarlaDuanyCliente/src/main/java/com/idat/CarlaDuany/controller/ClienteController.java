package com.idat.CarlaDuany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.CarlaDuany.modelo.Cliente;
import com.idat.CarlaDuany.service.ClienteService;

@Controller
@RequestMapping("/cliente/v1")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Cliente> listarCliente(){
		return service.listarCliente();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Cliente ClientePorId(@PathVariable Integer id) {
		return service.clientePorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void EliminarCliente(@PathVariable Integer id) {
		service.elimanarCliente(id);
	}
	
	@PostMapping("/")
	public void GuardarCliente(@RequestBody Cliente cliente) {
		service.guardarCliente(cliente);
	}
}
