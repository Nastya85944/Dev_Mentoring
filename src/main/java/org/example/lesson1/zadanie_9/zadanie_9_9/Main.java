package org.example.lesson1.zadanie_9.zadanie_9_9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Motorcycle());
        vehicles.add(new Motorcycle());
        vehicles.add(new Motorcycle());
        vehicles.add(new Tram());
        vehicles.add(new Tram());
        vehicles.add(new Tram());
        vehicles.add(new Car());
        vehicles.add(new Car());
        vehicles.add(new Car());

        for (Vehicle vehicle: vehicles){
            vehicle.start();
        }
    }
}
