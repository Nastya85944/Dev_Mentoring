package org.example.lesson1.zadanie_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task_5_15 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "orange", "yellow", "blue", "white", "brown", "grey", "black"));
        colors.add("rue");
        colors.set(5, "lilac");
        colors.add("turquoise");
        colors.sort(Comparator.naturalOrder());
        System.out.println("natural order: " + colors);

        List<String> reversedColours = new ArrayList<>(Arrays.asList("red", "orange", "yellow", "blue", "white", "brown", "grey", "black"));
        reversedColours.sort(Comparator.reverseOrder());
        System.out.println("reversed order: " + reversedColours);
    }
}
