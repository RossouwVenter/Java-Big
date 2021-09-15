package com.company.mypackage;

public class SIBTest {
    public static final String owner;

    static{
        owner = "Rossouw";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }
    static {
        System.out.println("2nd In");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
