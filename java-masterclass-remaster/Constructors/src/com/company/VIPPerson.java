package com.company;

public class VIPPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPPerson(){
        this("Default name",50000.00, "default@email.com");
    }

    public VIPPerson(String name, double creditLimit) {
        this(name,creditLimit,"unkwon@email.com");
    }

    public VIPPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
