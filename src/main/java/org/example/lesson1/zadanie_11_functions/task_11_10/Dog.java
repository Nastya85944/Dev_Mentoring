package org.example.lesson1.zadanie_11_functions.task_11_10;

public class Dog extends Animal {

    private String type = "Dog";

    public Dog(String name, int noEyes) {
        super(name, noEyes);
    }

    public String getType() {
        return type;
    }
}
