package com.example.projetdd_savegame;

import jakarta.persistence.*;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String board;

    public Board() {
    }

    public Board(int id, String board) {
        this.id = id;
        this.board = board;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", board='" + board +
                '}';
    }
}
