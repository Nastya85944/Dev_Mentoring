package org.example.lesson1.zadanie_4;

import java.util.Scanner;
import java.util.stream.Stream;

public class Task_4_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integers value (i.e 1 5 6 9): ");
        String values = scanner.nextLine();

        Integer [] array = Stream.of(values.split("\\s")).map(Integer::valueOf).toArray(Integer []:: new );

        int sum = 0;
        for (Integer i: array){
            sum += i;
        }
        System.out.println("Final sum: " + sum);

    }
}
