package com.example.Libruary;

public class Reader {
     private String name;
    private String firstName;
    private String secondName;
    private String date;
    private String department;

    private int numberOfTicket;
    private String telephoneNumber;

    public Reader(String name, String firstName, String secondName, String department, String date, String telephoneNumber) {
        this.name = name;
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.date = date;
        this.telephoneNumber = telephoneNumber;
    }

    public Reader() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}


