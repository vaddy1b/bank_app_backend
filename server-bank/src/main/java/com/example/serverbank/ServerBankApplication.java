package com.example.serverbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerBankApplication.class, args);
    }

}
