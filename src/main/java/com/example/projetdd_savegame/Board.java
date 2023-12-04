package com.example.projetdd_savegame;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Board {

    @Id
    @ForeignKey
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private ArrayList<Case> board;

    public Board() {
    }
}
