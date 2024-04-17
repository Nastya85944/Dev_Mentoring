package org.example.lesson1.zadanie_8.Task_8_9;

public class MessagingSystem {

    private final Warning warning;
    private final Info info;

    public MessagingSystem() {
        this.warning = new Warning();
        this.info = new Info();
    }

    public void executeWarning() {
        warning.showWarning();
        System.out.println("Warning counter: " + warning.getWarningCounter());
    }

    public void executeInfo() {
        info.showInfo();
        System.out.println("Info counter: " + info.getInfoCounter());
    }
}
