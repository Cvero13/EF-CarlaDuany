package com.idat.CarlaDuanyRopa.service;

import java.util.List;

import com.idat.CarlaDuanyRopa.modelo.Ropa;

public interface RopaService {

	public List<Ropa> ListarRopa();
	public Ropa RopaPorId(Integer id);
	public void ElimanarRopa(Integer id);
	public void GuardarRopa(Ropa ropa);
}
