package com.example.projetdd_savegame;

import jakarta.persistence.*;

@Entity
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int hero_id;
    private String name;
    private String type;
    private int life;
    private int strength;
    private int position;

    public Hero() {
    }

    public Hero(int id, String name, String type, int life, int strength, int position) {
        this.hero_id = id;
        this.name = name;
        this.type = type;
        this.life = life;
        this.strength = strength;
        this.position = position;
    }

    public int getHero_id() {
        return hero_id;
    }

    public void setHero_id(int heroId) {
        this.hero_id = heroId;
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

    @Override
    public String toString() {
        return "Hero{" +
                "hero_id=" + hero_id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", life=" + life +
                ", strength=" + strength +
                ", position=" + position +
                '}';
    }
}
