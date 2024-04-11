package org.example.lesson1.zadanie_3;

import java.util.Scanner;

public class Task_3_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any integer value");
        int enteredValue = scanner.nextInt();
        if(enteredValue % 3 == 0 && enteredValue % 4 == 0){
            System.out.println("FizzBuzz");
        } else if(enteredValue % 4 == 0){
            System.out.println("Buzz");
        } else if(enteredValue % 3 == 0){
            System.out.println("Fizz");
        } else {
            System.out.println("N/A");
        }
    }
}
