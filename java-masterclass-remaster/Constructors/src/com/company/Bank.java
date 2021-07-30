package com.company;

public class Bank {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Bank(){
        this(123,20.50,"default Name","default address",00);
        System.out.println("Empty constructor called");
    }

    public Bank(int number, double balance, String customerName, String email,int phoneNumber){
        System.out.println("Bank constructor with parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setDepositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println(balance + " is the current balance after deposited");
    }

    public void setWithdrawFunds(double withdrawal){
        while (this.balance - withdrawal >= 0){
            this.balance -= withdrawal;
            System.out.println(balance + " is the current balance after the withdrawal");
        }
    }
}

