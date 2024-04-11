package org.example.lesson1.zadanie_3;

import java.util.Scanner;

public class Task_3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your last name: ");
        String lastName = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your growth: ");
        int growth = scanner.nextInt();

        System.out.println("Hello " + name + " " + lastName + "! Thank you for joining us. " +
                "You are " + age + " years old and your height is " + growth);
    }
}
