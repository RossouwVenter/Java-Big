package com.company.mypackage;

public class Main {

    public static void main(String[] args) {
	SomeClass one = new SomeClass("One");
	SomeClass two = new SomeClass("Two");
	SomeClass three = new SomeClass("Three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4;

        System.out.println(Math.PI);
//        Math m = new Math();

        int pw = 678392;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(83920);
        password.letMeIn(998723);
        password.letMeIn(678392);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
