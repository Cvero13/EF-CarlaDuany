package com.idat.CarlaDuany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.CarlaDuany.modelo.Cliente;
import com.idat.CarlaDuany.repository.ClinteRepository;
@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClinteRepository repository;
	
	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente clientePorId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void elimanarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(cliente);
	}

}
