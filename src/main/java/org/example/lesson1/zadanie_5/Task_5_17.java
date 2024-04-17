package org.example.lesson1.zadanie_5;

import java.util.*;

public class Task_5_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> alboms = new HashMap<>();
        alboms.put("The Sensual World", "Kate Bush");
        alboms.put("Shaday", "Ofra Haza");
        alboms.put("Achtung Baby", "U2");
        alboms.put("Aion", "Dead Can Dance");
        alboms.put("Invisible Touch", "'Genesis");

        for(String name: alboms.keySet()){
            System.out.println(name);
        }
        System.out.print("Enter an album name from the list above: ");

        String albumName = scanner.next();
        boolean albomExist = false;
        for(Map.Entry<String, String> entry: alboms.entrySet()){
            if(albumName.equals(entry.getKey())){
                albomExist = true;
                System.out.println("The artist of the album " + entry.getKey() + " is " + entry.getValue());
            }
        }
        if(!albomExist) {
            System.out.println("No data");
        }
    }
}
