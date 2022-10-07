package com.pluralsight.model;

public class Speaker {

    private String firstName; //  set as private to prevent unnecessary changes

    private String lastName;
    private double seedNum;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
//        setter method and it returns nothing
        this.firstName = firstName;
    }

    public String getLastName() {
//        this class returns the last name (string is returned)
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }
}
