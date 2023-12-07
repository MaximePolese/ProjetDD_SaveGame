package com.example.projetdd_savegame;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String board;
//    @Transient
//    private List<Case> bd;

    public Board() {
    }

    public Board(int id, List<Case> bd) throws JsonProcessingException {
        this.id = id;
        this.board = translate(bd);
    }

    public String translate(List<Case> bd) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        this.board = objectMapper.writeValueAsString(bd);
        System.out.println(board);
        return board;
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
