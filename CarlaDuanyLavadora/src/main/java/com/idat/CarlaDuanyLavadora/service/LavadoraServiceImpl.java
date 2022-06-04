package com.idat.CarlaDuanyLavadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.CarlaDuanyLavadora.modelo.Lavadora;
import com.idat.CarlaDuanyLavadora.repository.LavadoraRepository;

@Service
public class LavadoraServiceImpl implements LavadoraService {

	@Autowired
	private LavadoraRepository repository;
	
	@Override
	public List<Lavadora> ListarLavadora() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Lavadora LavadoraPorId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void ElimanarLavadora(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void GuardarLavadora(Lavadora lavadora) {
		// TODO Auto-generated method stub
		repository.save(lavadora);
	}

}
