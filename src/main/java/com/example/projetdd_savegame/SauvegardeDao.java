package com.example.projetdd_savegame;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SauvegardeDao extends JpaRepository<Sauvegarde, Integer> {
    List<Sauvegarde> findAll();

    Sauvegarde findById(int id);

    Sauvegarde save(Sauvegarde sauvegarde);

    void deleteById(int id);
}
