package com.example.projetdd_savegame;

import jakarta.persistence.*;

@Entity
@Table(name = "sauvegarde")
public class Sauvegarde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int saveId;
    @OneToOne
    @JoinColumn(name = "heroId",  referencedColumnName = "heroId")
    private Hero myHero;
    @OneToOne
    @JoinColumn(name = "boardId",  referencedColumnName = "boardId")
    private Board myBoard;

    public Sauvegarde() {
    }

    public Sauvegarde(int id, Hero hero, Board board) {
        this.saveId = id;
        this.myHero = hero;
        this.myBoard = board;
    }

    public int getSaveId() {
        return saveId;
    }

    public void setSaveId(int id) {
        this.saveId = id;
    }

    public Hero getMyHero() {
        return myHero;
    }

    public void setMyHero(Hero myHero) {
        this.myHero = myHero;
    }

    public Board getMyBoard() {
        return myBoard;
    }

    public void setMyBoard(Board myBoard) {
        this.myBoard = myBoard;
    }

    @Override
    public String toString() {
        return "Sauvegarde{" +
                "id=" + saveId +
                ", myHero=" + myHero +
                ", myBoard=" + myBoard +
                '}';
    }
}
