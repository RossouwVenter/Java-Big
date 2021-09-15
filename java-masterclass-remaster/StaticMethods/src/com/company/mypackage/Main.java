package com.company.mypackage;

public class Main {
    public static int multiplier = 7;
    public static void main(String[] args) {
//	StaticTest firstInstance = new StaticTest("1st instance");
//        System.out.println(firstInstance.getName() + "is instance number" +  StaticTest.getNumInstance());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number" + StaticTest.getNumInstance());
//
//        StaticTest thirdInstance = new StaticTest("3nd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number" + StaticTest.getNumInstance());
//        java com.company._static.Main
        int answer = multiply(6);
        System.out.println("The Answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }
    public static int multiply(int number){
        return number * multiplier;
    }
}
