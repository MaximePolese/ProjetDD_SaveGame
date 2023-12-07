package com.example.projetdd_savegame;

public class SauvegardeDTO {

    private int id;
    private Hero myHero;
    private Board myBoard;

    public SauvegardeDTO() {
    }

    public SauvegardeDTO(int id, Hero hero, Board board) {
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
