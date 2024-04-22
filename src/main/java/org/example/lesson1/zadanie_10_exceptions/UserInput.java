package org.example.lesson1.zadanie_10_exceptions;

import java.util.Scanner;

public class UserInput {

    public static FileHandler handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String fileName = scanner.next();
        System.out.print("Enter no connectors value: ");
        int connectionNumber = scanner.nextInt();
        System.out.print("Enter max file size: ");
        int maxFileSize = scanner.nextInt();

        FileHandler fileHandler;
        try {
            return new FileHandler(fileName, connectionNumber, maxFileSize);
        } catch (InvalidDataException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return null;
        } finally{
            scanner.close();
        }


    }
}
