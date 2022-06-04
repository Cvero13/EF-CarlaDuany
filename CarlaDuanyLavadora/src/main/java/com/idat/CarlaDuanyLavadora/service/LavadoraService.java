package com.idat.CarlaDuanyLavadora.service;

import java.util.List;

import com.idat.CarlaDuanyLavadora.modelo.Lavadora;

public interface LavadoraService {

	public List<Lavadora> ListarLavadora();
	public Lavadora LavadoraPorId(Integer id);
	public void ElimanarLavadora(Integer id);
	public void GuardarLavadora(Lavadora lavadora);
}
