package org.example.lesson1.zadanie_4;

public class Task_4_12 {

    public static void main(String[] args) {
        //infinite loop using 'for'
        for(int i = 1; i > 0; i++){
            System.out.println(i);
        }

        //infinite loop using 'while'
        int i = 1;
        while(i > 0){
            System.out.println(i);
            i++;
        }

        //infinite loop using 'do ... while'
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while(j > 0);
    }
}
