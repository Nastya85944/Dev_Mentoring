package org.example.lesson1.zadanie_6;

//Task 5_4
public class Student {
    private String firsName;
    private String lastName;
    private int age;
    private String group;
    private String faculty;

     public void displayStudentData(){
        System.out.println("Student's first name: " + firsName);
        System.out.println("Student's last name: " + lastName);
        System.out.println("Student's age: " + age);
        System.out.println("Group: " + group);
        System.out.println("Faculty: " + faculty);
    }
}
