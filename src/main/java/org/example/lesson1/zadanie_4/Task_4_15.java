package org.example.lesson1.zadanie_4;

import java.util.Scanner;

public class Task_4_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int number = scanner.nextInt();

        int sum = 0, i = 1;
        while (sum < number) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }

        if (sum == number) {
            System.out.println(number + " is perfect number");
        } else {
            System.out.println(number + " isn't perfect number");
        }
    }
}
