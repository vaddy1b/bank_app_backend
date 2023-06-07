package com.example.checklidinblacklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ChecklidInBlacklistApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChecklidInBlacklistApplication.class, args);
    }

}
