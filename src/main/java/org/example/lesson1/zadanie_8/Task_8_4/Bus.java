package org.example.lesson1.zadanie_8.Task_8_4;

public class Bus extends Vehicles {
    private final int consumedFuel;

    public Bus(int maxSpeed, String number, int consumedFuel, Depot busDepot) {
        super(maxSpeed, number, busDepot);
        this.consumedFuel = consumedFuel;
    }

    public int getConsumedFuel() {
        return consumedFuel;
    }

    public String information() {
        return super.information() + ", consumedFuel: " + getConsumedFuel();
    }
}
