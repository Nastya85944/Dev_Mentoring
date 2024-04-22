package org.example.lesson1.zadanie_11_functions;

import java.util.HashMap;
import java.util.Map;

public class Task_11_9 {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("John", 30);
        students.put("Ann", 20);
        students.put("Casper", 10);
        students.put("Jamie", 20);

        long count = students.entrySet().stream()
                .filter(student -> student.getValue() > 20)
                .filter(student -> student.getKey().length() > 3)
                .count();
        System.out.println(count);
    }
}
