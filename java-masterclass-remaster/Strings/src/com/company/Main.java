package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("My String is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.96";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("\nLastString is equal to " + lastString);
//      Same with a double value. Will display it as a string. and not add it.
    }
}
