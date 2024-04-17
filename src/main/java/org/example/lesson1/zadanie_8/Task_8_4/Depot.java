package org.example.lesson1.zadanie_8.Task_8_4;

import java.util.ArrayList;
import java.util.List;

public class Depot {

    protected String name;
    protected List<Vehicles> vehicles;

    public Depot(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Vehicles> getVehicles() {
        return vehicles;
    }

    public void addVehicles(Vehicles vehicle) {
        vehicles.add(vehicle);
    }

    public void information() {
        System.out.println("Vehicles information: ");
        for (Vehicles vehicle : getVehicles()) {
            System.out.println(vehicle.information());
        }
    }
}
