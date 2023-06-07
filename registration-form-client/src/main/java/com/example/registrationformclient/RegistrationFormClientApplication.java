package com.example.registrationformclient;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Log4j2
@SpringBootApplication
@EnableDiscoveryClient
public class RegistrationFormClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(RegistrationFormClientApplication.class, args);
        log.info("RegistrationFormClientApplication -> main -> run app");
    }
}
