package com.example.projetdd_savegame;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class SauvegardeController {

    private final SauvegardeDao sauvegardeDao;

    public SauvegardeController(SauvegardeDao sauvegardeDao) {
        this.sauvegardeDao = sauvegardeDao;
    }

    @GetMapping("/sauvegardes")
    public List<Sauvegarde> listeDesSauvegardes() {
        return sauvegardeDao.findAll();
    }

    @GetMapping("/sauvegardes/{id}")
    public ResponseEntity<Sauvegarde> chargerUneSauvegarde(@PathVariable int id) {
        Sauvegarde save = sauvegardeDao.findById(id);
        if (Objects.isNull(save)) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(save);
        }
    }

    @DeleteMapping(value = "/sauvegardes/{id}")
    public ResponseEntity<Sauvegarde> supprimerUneSauvegarde(@PathVariable int id) {
        Sauvegarde save = sauvegardeDao.findById(id);
        if (Objects.isNull(save)) {
            return ResponseEntity.notFound().build();
        } else {
            sauvegardeDao.deleteById(id);
        }
        return ResponseEntity.ok().build();
    }

    @PostMapping("/sauvegardes")
    public Sauvegarde sauvegarderUnePartie(@RequestBody Sauvegarde sauvegarde) {
        System.out.println(sauvegarde);
        return sauvegardeDao.save(sauvegarde);
    }

//    @PostMapping("/encours")
//
//    @GetMapping("/encours")

}
