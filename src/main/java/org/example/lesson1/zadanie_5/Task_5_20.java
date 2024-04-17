package org.example.lesson1.zadanie_5;

import java.util.*;

public class Task_5_20 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(Arrays.asList("green", "red", "blue", "black", "purple", "navy blue",
                "blue", "black", "black", "green", "lemon", "navy blue", "blue ", "indigo", "green", "red"));
        Set<String> uniqueColors = new HashSet<>(colors);

        System.out.println("Items of the original color: " + colors.size());
        System.out.println("Unique colors: " + uniqueColors.size());

        for(String color: uniqueColors){
            System.out.println(color);
        }

        uniqueColors.add("green");
        uniqueColors.add("white");
        System.out.println(uniqueColors);

        uniqueColors.remove("green");
        System.out.println(uniqueColors);
    }
}
