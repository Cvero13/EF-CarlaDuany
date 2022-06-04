package com.idat.CarlaDuany.service;

import java.util.List;

import com.idat.CarlaDuany.modelo.Cliente;

public interface ClienteService {

	public List<Cliente> listarCliente();
	public Cliente clientePorId(Integer id);
	public void elimanarCliente(Integer id);
	public void guardarCliente(Cliente cliente);
}
