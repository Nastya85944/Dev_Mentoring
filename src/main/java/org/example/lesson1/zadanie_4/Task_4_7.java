package org.example.lesson1.zadanie_4;

import java.util.Scanner;

public class Task_4_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a total number k: ");
        int totalNumber = scanner.nextInt();
        System.out.print("Enter a start range: ");
        int startRange = scanner.nextInt();
        System.out.print("Enter a end range: ");
        int endRange = scanner.nextInt();

        for(int i = startRange; i <  endRange; i++){
            System.out.println((double) i/totalNumber);
        }
    }
}
