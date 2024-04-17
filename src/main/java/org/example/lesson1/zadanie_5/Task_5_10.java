package org.example.lesson1.zadanie_5;

public class Task_5_10 {
    public static void main(String[] args) {
        int[][] array2D = new int[10][3];
        for(int i = 0; i < array2D.length; i++){
                array2D[i][0] = i;
                array2D[i][1] = i*i;
                array2D[i][2] = i*i*i;
        }

        for (int [] subarray: array2D) {
            for (int element: subarray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
