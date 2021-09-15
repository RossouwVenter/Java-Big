package com.company.mypackage;

public class StaticTest {
    private static int numInstance = 0;
    private String name;

    public StaticTest(int numInstance, String name) {
        this.numInstance = numInstance;
        this.name = name;
    }

    public static int getNumInstance() {
        return numInstance;
    }

    public String getName() {
        return name;
    }
}
