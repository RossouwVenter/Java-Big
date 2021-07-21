package com.company;

public class Main {

    public static void main(String[] args) {
    double doubleVariable = 20.00;
    double doubleVariable2 = 80.00;

    double total = (doubleVariable + doubleVariable2) * 100;
        System.out.println("MyValuesTotal: " + total);
    double remainder = total % 40.00;
        System.out.println("Remainder: " + remainder);

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
    if (!isNoRemainder){
        System.out.println("Got some remainder");
    }
        System.out.println("Got No remainder");





    }
}
