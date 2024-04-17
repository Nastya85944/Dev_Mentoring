package org.example.lesson1.zadanie_5;

public class Task_5_9 {

    public static void main(String[] args) {
        int[][] array2D = new int[4][];
        array2D[0] = new int[6];
        array2D[1] = new int[7];
        array2D[2] = new int[8];
        array2D[3] = new int[9];

        int value = 10;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = value;
                value += 10;
            }
        }

        for (int[] subarray : array2D) {
            for (int element : subarray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
