package org.example.lesson1.zadanie_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_5_13 {
    private static final String STOP = "STOP";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        String word = "";

        while (!checkEnteredWord(word)) {
            System.out.print("Please enter any words. 'STOP' word will stop the process of entering");
            word = scanner.next();
            if (!checkEnteredWord(word)) {
                words.add(word);
            }
        }

        System.out.println("List size: " + words.size());
        System.out.println("First element: " + words.get(0));
        System.out.println("First element: " + words.get(words.size() - 1));
        System.out.println("Middle Element: " + words.get(words.size() / 2));
    }

    private static boolean checkEnteredWord(String word){
        return word.equals(STOP);
    }
}
