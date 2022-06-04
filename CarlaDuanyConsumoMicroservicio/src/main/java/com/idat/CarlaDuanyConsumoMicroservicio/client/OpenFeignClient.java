package com.idat.CarlaDuanyConsumoMicroservicio.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.CarlaDuanyConsumoMicroservicio.modelo.Ropa;



@FeignClient(name = "CarlaDuany-Ropa", url = "localhost:8080")
public interface OpenFeignClient {

	@GetMapping("/ropa/v1/listar")
	public List<Ropa> listarRopa();
}
