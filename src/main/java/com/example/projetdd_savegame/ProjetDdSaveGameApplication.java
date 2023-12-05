package com.example.projetdd_savegame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjetDdSaveGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetDdSaveGameApplication.class, args);
    }

}
