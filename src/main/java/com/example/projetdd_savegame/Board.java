package com.example.projetdd_savegame;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "board")
public class Board {
    @Id
    private int boardId;
//    @OneToOne(mappedBy = "board")
//    private Sauvegarde sauvegarde;

    //private List<Case> board;

    public Board() {
    }

    public Board(int id) {
        this.boardId = id;
        //this.board = new ArrayList<Case>(64);
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

//    public ArrayList<Case> getBoard() {
//        return board;
//    }
//
//    public void setBoard(ArrayList<Case> board) {
//        this.board = board;
//    }
//
//    @Override
//    public String toString() {
//        return "Board{" +
//                "boardId=" + boardId +
//                ", board=" + board +
//                '}';
//    }
}
