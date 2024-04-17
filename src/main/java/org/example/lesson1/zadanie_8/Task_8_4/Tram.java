package org.example.lesson1.zadanie_8.Task_8_4;

public class Tram extends Vehicles {

    private int wagonsNumber;

    public Tram(int maxSpeed, String number, int wagonsNumber, Depot tramDepot) {
        super(maxSpeed, number, tramDepot);
        this.wagonsNumber = wagonsNumber;
    }

    public int getWagonsNumber() {
        return wagonsNumber;
    }

    public String information() {
        return super.information() + ", wagons number: " + getWagonsNumber();
    }
}
