package org.example.lesson1.zadanie_9.Task_9_4;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator() {
            @Override
            public int substract(int a, int b) {
                return a-b;
            }

            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int multiply(int a, int b) {
                return a*b;
            }

            @Override
            public double divide(int a, int b) {
                return a/b;
            }
        };

        CalculationSystem calculationSystem = new CalculationSystem(calculator);
        calculationSystem.performCalculations(7, 5);
    }
}
