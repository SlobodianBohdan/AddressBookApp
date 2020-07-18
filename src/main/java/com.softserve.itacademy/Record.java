package com.softserve.itacademy;


public class Record {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    private static int counter = 1;


    public Record(String firstName, String lastName, String address) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Record() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Record.counter = counter;
    }

}
