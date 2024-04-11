package org.example.lesson1.zadanie_4;

import java.util.Scanner;

public class Task_4_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int value = scanner.nextInt();

        for(int i = 0; i < value; i++){
            System.out.println(i + " ");
        }

        System.out.print("--------");
        int i = 0;
        while(i < value){
            System.out.print(i + " ");
            i++;
        }
    }
}
