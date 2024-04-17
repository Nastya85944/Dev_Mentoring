package org.example.lesson1.zadanie_8.Task_8_4;

public class Main {

    public static void main(String[] args) {

        Depot tramDepot = new Depot("Tram Depot");
        Depot busDepot = new Depot("Bus Depot");

        Tram tram1 = new Tram(80, "KL 5699", 2, tramDepot);
        Tram tram2 = new Tram(90, "KL 8877", 3, tramDepot);
        Bus bus1 = new Bus(150, "AK 5696", 1500, busDepot);
        Bus bus2 = new Bus(120, "AK 4533", 1000, busDepot);

        tramDepot.addVehicles(tram1);
        tramDepot.addVehicles(tram2);
        busDepot.addVehicles(bus1);
        busDepot.addVehicles(bus2);

        tramDepot.information();
        busDepot.information();

        int wagonsNumber = 0, totalWagons = 0;
        for (Vehicles tram : tramDepot.getVehicles()) {
            totalWagons += ((Tram) tram).getWagonsNumber();
        }

        for (Vehicles bus : busDepot.getVehicles()) {
            wagonsNumber += ((Bus) bus).getConsumedFuel();
        }

        System.out.println("The total number of wagons: " + totalWagons);
        System.out.println("The total fuel consumption: " + wagonsNumber);
    }
}
