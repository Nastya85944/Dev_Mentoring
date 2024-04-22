package org.example.lesson1.zadanie_11_functions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_11_2 {
    public static void main(String[] args) {

        List<Integer> oddNumbers = IntStream.range(1, 25)
                .filter(x -> x % 2 != 0).boxed()
                .collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<Integer> doubleDigits = IntStream.range(1, 25)
                .filter(x -> x > 9)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(doubleDigits);
    }
}
