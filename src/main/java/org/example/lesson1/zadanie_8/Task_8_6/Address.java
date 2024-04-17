package org.example.lesson1.zadanie_8.Task_8_6;

public class Address {

    private final String city;
    private final String street;
    private final String state;
    private final int postCode;
    private final String country;

    public Address(String city, String street, String state, int postCode, String country) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.postCode = postCode;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public void validateOutputAsLabel(String input){

    }
}
