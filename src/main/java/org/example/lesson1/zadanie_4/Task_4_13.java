package org.example.lesson1.zadanie_4;

import java.util.Scanner;

public class Task_4_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. View the number of students. \n" +
                "2. View company name. \n" +
                "3. View the company's founding year. \n" +
                "4. Leave.");
        System.out.print("Select one of the option of menu: ");

        int option = scanner.nextInt();

        switch(option){
            case 1: System.out.println("70");
                break;
            case 2: System.out.println("Devs-Mentoring.pl");
                break;
            case 3: System.out.println("2021");
                break;
            case 4: System.exit(0);
            default: System.out.println("Selected option isn't correct");
        }

    }
}
