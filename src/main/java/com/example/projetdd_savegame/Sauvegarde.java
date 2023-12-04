package com.example.projetdd_savegame;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

public class Sauvegarde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private List<Sauvegarde> sauvegardes = new ArrayList<>();

    public Sauvegarde() {
    }

    public Sauvegarde(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sauvegarde{" +
                "id=" + id +
                '}';
    }
}
