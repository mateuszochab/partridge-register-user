package com.ochabmateusz.partridge.partridgeregisteruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PartridgeRegisterUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartridgeRegisterUserApplication.class, args);
	}

}
