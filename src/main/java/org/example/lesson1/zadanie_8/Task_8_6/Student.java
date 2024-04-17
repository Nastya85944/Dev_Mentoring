package org.example.lesson1.zadanie_8.Task_8_6;

public class Student extends Person {

    private final int  studentNumber;
    private final double averageMark;


    public Student(String name, int phoneNumber, String emailAddress, Address address, int studentNumber, double averageMark) {
        super(name, phoneNumber, emailAddress, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public boolean isEligibleToEnroll() {
        return false;
    }

    public String getSeminarsToken() {
        return "Token";
    }

}
