package org.example.lesson1.zadanie_5;


public class Task_5_8 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};

        int treeDigitNumbers = getTreeDigitNumbers(numbers);
        int treeDigitNumbers2D = getTreeDigitNumbers2D(numbers2D);

        System.out.println(treeDigitNumbers);
        System.out.println(treeDigitNumbers2D);
    }

    private static int getTreeDigitNumbers(int[] array) {
        int treeDigitNumbers = 0;
        //first approach
        for (int number : array) {
            if (String.valueOf(number).length() == 3) {
                treeDigitNumbers++;
            }
        }

        //second approach
        for (int number : array) {
            if (number > 99 && number < 1000) {
                treeDigitNumbers++;
            }
        }
        return treeDigitNumbers;
    }

    private static int getTreeDigitNumbers2D(int[][] array) {
        int treeDigitNumbers = 0;
        for (int[] row : array) {
            for (int column : row) {
                if (column > 99 && column < 1000) {
                    treeDigitNumbers++;
                }
            }
        }
        return treeDigitNumbers;
    }
}


