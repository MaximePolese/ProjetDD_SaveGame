package com.example.projetdd_savegame;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class SauvegardeController {

    private DAO dao;

    public SauvegardeController(DAO dao) {
        this.dao = dao;
    }

    @GetMapping("/sauvegarges")
    public List<Sauvegarde> listeDesSauvegardes() {
        return dao.findAll();
    }

    @GetMapping("/sauvegardes/{id}")
    public ResponseEntity<Sauvegarde> chargerUneSauvegarde(@PathVariable int id) {
        Sauvegarde save = dao.findById(id);
        if (Objects.isNull(save)) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(save);
        }
    }

    @DeleteMapping(value = "/sauvegardes/{id}")
    public ResponseEntity<Sauvegarde> supprimerUneSauvegarde(@PathVariable int id) {
        Sauvegarde save = dao.findById(id);
        if (Objects.isNull(save)) {
            return ResponseEntity.notFound().build();
        } else {
            dao.deleteById(id);
        }
        return ResponseEntity.ok().build();
    }

    @PostMapping("/sauvegardes")
    public Sauvegarde sauvegarderUnePartie(Sauvegarde sauvegarde){
        return dao.save(sauvegarde);
    }


//    @Override
//    public Sauvegarde findById(int id) {
//        return restTemplate.getForObject("http://ProjetDD_SaveGame/sauvegardes/{id}", Sauvegarde.class);
//    }
//
//    @Override
//    public Sauvegarde save(Sauvegarde sauvegarde) {
//        return restTemplate.postForObject("http://ProjetDD_SaveGame/sauvegardes", sauvegarde, Sauvegarde.class);
//    }
}
