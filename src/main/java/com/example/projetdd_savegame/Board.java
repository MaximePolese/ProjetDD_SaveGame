package com.example.projetdd_savegame;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int board_id;
    @Transient
    private List<Case> _board;
    private String board;

    public Board() {
    }

    public Board(int id) {
        this.board_id = id;
        this._board = new ArrayList<Case>(64);
    }

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int boardId) {
        this.board_id = boardId;
    }

    public List<Case> getBoard() {
        return _board;
    }

    public void setBoard(List<Case> board) throws JsonProcessingException {
        this._board = board;
        final ObjectMapper mapper = new ObjectMapper();
        this.board = mapper.writeValueAsString(board);
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + board_id +
                ", board=" + board +
                '}';
    }
}
