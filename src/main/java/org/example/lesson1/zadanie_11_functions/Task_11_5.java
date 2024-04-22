package org.example.lesson1.zadanie_11_functions;

import java.util.Arrays;

public class Task_11_5 {

    public static void main(String[] args) {
        int[] array = {1, 10, 15, 20, 30, 40, 50};

        int[] squares = Arrays.stream(array).map(x -> x * x).toArray();
        System.out.println(Arrays.toString(squares));
    }
}
