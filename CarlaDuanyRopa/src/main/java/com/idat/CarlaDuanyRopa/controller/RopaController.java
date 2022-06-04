package com.idat.CarlaDuanyRopa.controller;

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

import com.idat.CarlaDuanyRopa.modelo.Ropa;
import com.idat.CarlaDuanyRopa.service.RopaService;

@Controller
@RequestMapping("/ropa/v1")
public class RopaController {
	
	@Autowired
	private RopaService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Ropa> Listar(){
		return service.ListarRopa();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Ropa RopaPorId(@PathVariable Integer id) {
		return service.RopaPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void EliminarRopa(@PathVariable Integer id) {
		service.ElimanarRopa(id);
	}
	
	@PostMapping("/")
	public void guardarRopa(@RequestBody Ropa ropa) {
		service.GuardarRopa(ropa);
	}

}
