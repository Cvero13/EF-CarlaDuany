package com.idat.CarlaDuanyConsumoMicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class CarlaDuanyConsumoMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarlaDuanyConsumoMicroservicioApplication.class, args);
	}

}
