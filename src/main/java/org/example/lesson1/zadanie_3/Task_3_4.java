package org.example.lesson1.zadanie_3;

import java.util.Scanner;

public class Task_3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any integer value");
        int enteredValue = scanner.nextInt();
        System.out.println(enteredValue % 2 == 0 ? "Even number" : "Odd number");
    }
}

