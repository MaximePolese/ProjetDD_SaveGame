package com.example.projetdd_savegame;

public class Case {
    private String value;

    public Case() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Case{" +
                "value='" + value + '\'' +
                '}';
    }
}
