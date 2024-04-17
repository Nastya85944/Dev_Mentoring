package org.example.lesson1.zadanie_8.Task_8_2;

public class Square extends Shape {

    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}
