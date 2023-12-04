package com.example.projetdd_savegame;

import jakarta.persistence.*;

@Entity
@Table(name = "hero")
public class Hero {
    @Id
    private int heroId;
    private String name;
    private String type;
    private int life;
    private int strength;
    private int position;
//    @OneToOne(mappedBy = "hero")
//    private Sauvegarde sauvegarde;

    public Hero() {
    }

    public Hero(int id, String name, String type, int life, int strength, int position) {
        this.heroId = id;
        this.name = name;
        this.type = type;
        this.life = life;
        this.strength = strength;
        this.position = position;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

//    public Sauvegarde getSauvegarde() {
//        return sauvegarde;
//    }
//
//    public void setSauvegarde(Sauvegarde sauvegarde) {
//        this.sauvegarde = sauvegarde;
//    }

//    @Override
//    public String toString() {
//        return "Hero{" +
//                "heroId=" + heroId +
//                ", name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", life=" + life +
//                ", strength=" + strength +
//                ", position=" + position +
//                ", sauvegarde=" + sauvegarde +
//                '}';
//    }
}
