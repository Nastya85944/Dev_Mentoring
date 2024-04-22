package org.example.lesson1.zadanie_11_functions;

import java.util.Random;
import java.util.stream.IntStream;

public class Task_11_8 {

    public static void main(String[] args) {
        IntStream.generate(new Random()::nextInt)
                .filter(x -> x > 99 && x < 1000)
                .boxed()
                .forEach(System.out::println);
    }
}
