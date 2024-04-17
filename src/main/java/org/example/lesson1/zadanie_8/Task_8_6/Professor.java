package org.example.lesson1.zadanie_8.Task_8_6;

public class Professor extends Person{

    private final double salary;

    public Professor(String name, int phoneNumber, String emailAddress, Address address, double salary) {
        super(name, phoneNumber, emailAddress, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
