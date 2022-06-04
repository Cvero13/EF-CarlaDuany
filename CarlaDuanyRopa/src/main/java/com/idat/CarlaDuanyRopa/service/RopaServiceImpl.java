package com.idat.CarlaDuanyRopa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.CarlaDuanyRopa.modelo.Ropa;
import com.idat.CarlaDuanyRopa.repository.RopaRepository;

@Service
public class RopaServiceImpl implements RopaService {

	@Autowired
	private RopaRepository repository;
	
	@Override
	public List<Ropa> ListarRopa() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Ropa RopaPorId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void ElimanarRopa(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void GuardarRopa(Ropa ropa) {
		// TODO Auto-generated method stub
		repository.save(ropa);
	}

}
