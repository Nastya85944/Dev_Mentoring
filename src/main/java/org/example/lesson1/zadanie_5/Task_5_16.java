package org.example.lesson1.zadanie_5;

import java.util.HashMap;
import java.util.Map;

public class Task_5_16 {

    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("Anna", "12345678");
        users.put("Adam", "78945612");
        users.put("Olga", "56897412");
        users.put("Igor", "56897423");
        users.put("Mira", "59765822");

        System.out.println(users.containsKey("Anna") ? "Name Anna is in the map" : "No such name Anna");

        for(String value: users.values()){
            if(value.startsWith("9")){
                System.out.println(value);
            }
        }

        users.remove("Adam");
        users.remove("Olga");
        System.out.println("The map’s size is correct: " + users.size());

        System.out.println(users.containsKey("Euzebiusz") ? "Name Euzebiusz is in the map" : "No such name Euzebiusz");

        if(users.isEmpty()){
            System.out.println("Nothing to do here!");
        } else {
            for(Map.Entry<String, String> entry: users.entrySet()){
                System.out.println(entry.getKey() + ": value size is " + entry.getValue().length());
            }
        }
    }
}
