package com.example.projetdd_savegame;

import jakarta.persistence.*;

@Entity
public class Sauvegarde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    @JoinColumn(name = "hero_id")
    private Hero myHero;
    @OneToOne
    @JoinColumn(name = "board_id")
    private Board myBoard;

    public Sauvegarde() {
    }

    public Sauvegarde(int id, Hero hero, Board board) {
        this.id = id;
        this.myHero = hero;
        this.myBoard = board;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", myHero=" + myHero +
                ", myBoard=" + myBoard +
                '}';
    }
}
