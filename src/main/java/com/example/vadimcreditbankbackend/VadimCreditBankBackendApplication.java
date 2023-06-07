package com.example.vadimcreditbankbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class VadimCreditBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(VadimCreditBankBackendApplication.class, args);
	}

}
