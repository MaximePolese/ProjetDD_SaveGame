package com.example.projetdd_savegame;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Board {
    @Id
    @Column(name = "boardId")
    private int boardId;

    @Transient
    private List<Case> _board;

    private String board;

    public Board() {
    }

    public Board(int id) {
        this.boardId = id;
        this._board = new ArrayList<Case>(64);
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
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
                "boardId=" + boardId +
                ", board=" + board +
                '}';
    }
}
