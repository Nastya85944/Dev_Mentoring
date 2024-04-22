package org.example.lesson1.zadanie_9.Task_9_4;

public class CalculationSystem {
    private final Calculator calculator;

    public CalculationSystem(Calculator calculator) {
        this.calculator = calculator;
    }

    public void performCalculations(int a, int b) {
        System.out.println("Add: " + calculator.add(a, b));
        System.out.println("Divide: " + calculator.divide(a, b));
        System.out.println("Multiple: " + calculator.multiply(a, b));
        System.out.println("Substract: " + calculator.substract(a, b));
    }
}
