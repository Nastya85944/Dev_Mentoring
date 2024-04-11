package org.example.lesson1.zadanie_4;

import java.util.*;
import java.util.stream.Collectors;

public class Task_4_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter how many numbers should be drawn from the range -100 to 100: ");
            number = scanner.nextInt();
        } while (number == 0);

        int startRange = -100, endRange = 101, positiveNumbers = 0, negativeNumbers = 0;
        List<Integer> randomNumbers = new Random().ints(number, startRange, endRange).boxed().collect(Collectors.toList());
        for (Integer n : randomNumbers) {
            if (n > 0) {
                positiveNumbers++;
            } else {
                negativeNumbers++;
            }
        }

        Integer maxValue = randomNumbers.stream().max(Comparator.naturalOrder()).get();
        Integer mixValue = randomNumbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(randomNumbers);
        System.out.println(positiveNumbers / negativeNumbers + " " + mixValue + " " + maxValue);
    }
}
