package org.example.lesson1.zadanie_8.Task_8_6;

public class Person {

    protected String name;
    protected int phoneNumber;
    protected String emailAddress;

    protected Address address;

    public Person(String name, int phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void puschaseParkingPass(){
        //implementation
    }
}
