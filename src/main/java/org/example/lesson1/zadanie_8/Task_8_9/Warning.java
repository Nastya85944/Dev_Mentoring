package org.example.lesson1.zadanie_8.Task_8_9;

public class Warning {

    private static final String MESSAGE_WARNIG = "Watch out! Warning here!";
    private int warningCounter;

    public Warning() {
        this.warningCounter = 0;
    }

    public int getWarningCounter() {
        return warningCounter;
    }

    public void showWarning() {
        warningCounter++;
        System.out.println(MESSAGE_WARNIG);
    }
}
