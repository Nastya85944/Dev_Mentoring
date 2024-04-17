package org.example.lesson1.zadanie_8.Task_8_9;

public class Info {

    private static final String MESSAGE_INFO = "Listen carefully. We have some information regarding …";
    private int infoCounter;

    public Info() {
        this.infoCounter = 0;
    }

    public int getInfoCounter() {
        return infoCounter;
    }

    public void showInfo() {
        infoCounter++;
        System.out.println(MESSAGE_INFO);
    }
}
