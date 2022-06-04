package com.idat.CarlaDuanyEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class CarlaDuanyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarlaDuanyEurekaServerApplication.class, args);
	}

}
