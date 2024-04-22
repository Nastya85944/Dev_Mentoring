package org.example.lesson1.zadanie_10_exceptions;

public class InvalidDataException extends Exception{

    public InvalidDataException(String message) {
        super(message);
    }
}
