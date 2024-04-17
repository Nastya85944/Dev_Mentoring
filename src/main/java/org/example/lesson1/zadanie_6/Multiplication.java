package org.example.lesson1.zadanie_6;

//Task 6_9
public class Multiplication {

    public static int execute(int... values){
        int multiplying = 1;
        for(int value: values){
            multiplying *= value;
        }
        return multiplying;
    }

    public static float execute(float... values){
        float multiplying = 1.0f;
        for(float value: values){
            multiplying *= value;
        }
        return multiplying;
    }

    public static double execute(double... values){
        double multiplying = 1.0;
        for(double value: values){
            multiplying *= value;
        }
        return multiplying;
    }

    public static void main(String[] args) {
        System.out.println(execute(1, 2, 3));
        System.out.println(execute(5.0f, 2.0f));
        System.out.println(execute(4.0, 7.0));
    }
}
