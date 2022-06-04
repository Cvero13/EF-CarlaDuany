package com.idat.CarlaDuanyLavadora.controller;

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

import com.idat.CarlaDuanyLavadora.modelo.Lavadora;
import com.idat.CarlaDuanyLavadora.service.LavadoraService;

@Controller
@RequestMapping("/lavadora/v1")
public class LavadoraController {
	
	@Autowired
	private LavadoraService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Lavadora> Listar(){
		return service.ListarLavadora();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Lavadora LavadoraPorId(@PathVariable Integer id) {
		return service.LavadoraPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarLavadora(@PathVariable Integer id) {
		service.ElimanarLavadora(id);
	}
	
	@PostMapping("/")
	public void guardarLavadora(@RequestBody Lavadora lavadora) {
		service.GuardarLavadora(lavadora);
	}

}
