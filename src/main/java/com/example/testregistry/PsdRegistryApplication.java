package com.example.testregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PsdRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsdRegistryApplication.class, args);
	}

}
