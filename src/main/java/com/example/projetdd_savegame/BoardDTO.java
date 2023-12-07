package com.example.projetdd_savegame;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class BoardDTO {

    private int id;
    private List<Case> board;

    public BoardDTO(int id, List<Case> bd) throws JsonProcessingException {
        this.id = id;
        this.board = translate(bd);
    }

    public String translate(List<Case> bd) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        this.board = objectMapper.writeValueAsString(bd);
        System.out.println(board);
        return board;
    }
}
