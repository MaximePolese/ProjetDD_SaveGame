package com.example.projetdd_savegame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjetDdSaveGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetDdSaveGameApplication.class, args);
//        SauvegardeController controller = new SauvegardeController(dao);
//        Hero myHero = new Hero(1, "toto", "magicien", 15, 5, 12);
//        Board myBoard = new Board(1);
//        Sauvegarde test = new Sauvegarde(1, myHero, myBoard);
//        controller.sauvegarderUnePartie(test);
    }

}
