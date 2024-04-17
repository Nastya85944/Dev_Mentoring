package org.example.lesson1.zadanie_8.Task_8_4;

public class Vehicles {

    protected int maxSpeed;
    protected String number;
    protected Depot depot;

    public Vehicles(int maxSpeed, String number, Depot depot) {
        this.maxSpeed = maxSpeed;
        this.number = number;
        this.depot = depot;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getNumber() {
        return number;
    }

    public Depot getDepot() {
        return depot;
    }

    public String information() {
        return "Number " + getNumber() + ", maxSpeed: " + getMaxSpeed() + ", depotName: " + depot.getName();
    }
}
