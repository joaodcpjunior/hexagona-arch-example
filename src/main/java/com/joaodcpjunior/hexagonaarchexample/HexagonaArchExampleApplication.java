package com.joaodcpjunior.hexagonaarchexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HexagonaArchExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonaArchExampleApplication.class, args);
	}

}
