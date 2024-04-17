package org.example.lesson1.zadanie_5;

public class Task_5_11 {
    public static void main(String[] args) {

        String[][] names2D = {{"John", "Jasper"}, {"Casper", "Jonathan"}, {"Unknown", "Unknown"}, {"Alice", "Bob"}, {"Stanley", "Unknown"}};

        for (String [] subarray: names2D){
            for(String element: subarray){
                if(!element.contains("Unknown")){
                    System.out.println(element);
                }
            }
        }
    }
}
