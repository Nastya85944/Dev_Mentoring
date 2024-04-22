package org.example.lesson1.zadanie_10_exceptions;

public class Main {

    public static void main(String[] args) {

        FileHandler fileHandler = UserInput.handleUserInput();
        if(fileHandler != null){
            fileHandler.saveToFile("Test");
            fileHandler.getFilePath();
        }
    }
}
