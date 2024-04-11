package org.example.lesson1.zadanie_4;

import java.util.Scanner;

public class Task_4_10 {

    public static void main(String[] args) {
        int startingFuelLevel, astronautsNumber, rocketAltitude, fuelConsumption, distance= 100;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the initial fuel level in the range between 5,000 and 30,000 liters: ");
            startingFuelLevel = scanner.nextInt();
        } while (startingFuelLevel < 5000 || startingFuelLevel > 30000);

        do {
            System.out.print("Enter the appropriate number of astronauts on board in range from 1 to 7: ");
            astronautsNumber = scanner.nextInt();
        } while (astronautsNumber < 1 || astronautsNumber > 7);

        System.out.print("Enter the altitude of the rocket: ");
       rocketAltitude = scanner.nextInt();

        while(startingFuelLevel > 0){
            fuelConsumption = 300 + 100 * astronautsNumber;
            startingFuelLevel -= fuelConsumption;
            distance+=100;
        }

        System.out.println(distance);
        System.out.println(distance > 2000 ? "The spacecraft has reached orbit" : "The spacecraft did not reach orbit");
    }
}
