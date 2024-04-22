package org.example.lesson1.zadanie_11_functions.task_11_10;

public abstract class Animal {

    private String name;
    private int noEyes;

    public Animal(String name, int noEyes) {
        this.name = name;
        this.noEyes = noEyes;
    }

    public String getName() {
        return name;
    }

    public int getNoEyes() {
        return noEyes;
    }
}
