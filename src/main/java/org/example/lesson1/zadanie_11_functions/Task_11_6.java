package org.example.lesson1.zadanie_11_functions;

import java.util.List;
import java.util.stream.Collectors;

public class Task_11_6 {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "microservices", "Docker", "Kubernetes");

        List<String> filteredByWordCourses = courses.stream()
                .filter(x -> x.contains("Spring"))
                .collect(Collectors.toList());
        System.out.println(filteredByWordCourses);

        List<String> filteredByLengthCourses = courses.stream()
                .filter(x -> x.length() >= 4)
                .collect(Collectors.toList());
        System.out.println(filteredByLengthCourses);
    }
}
