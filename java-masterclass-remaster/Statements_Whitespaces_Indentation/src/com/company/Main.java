package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
//        int myVariable = 50; is the statement.
        myVariable++;
        myVariable--; // are statements
        System.out.println("This is a test"); // also a statement.

        System.out.println("This is " +
                "another " +
                "still more."); // also a statement.
        int anotherVar = 50;
        myVariable--; // valid but not Good.

    }
}
