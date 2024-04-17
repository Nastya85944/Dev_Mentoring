package org.example.lesson1.zadanie_7.Task_7_9;

public class Card {

    private String value;
    private String face;

    public Card(String value, String face) {
        this.value = value;
        this.face = face;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
}
