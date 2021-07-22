package com.company;

public class Exercise5 {
    public static void main(String[] args) {
        boolean numbers = areEqualByTreeDecimalPlaces(3.175, 3.176);
        System.out.println(numbers);
    }

    public static boolean areEqualByTreeDecimalPlaces(double number1, double number2){

        int varOne = (int)(1000 * number1 - Math.round(number1));
        int varTwo = (int)(1000 * number2 - Math.round(number2));

        if (varOne == varTwo){
            return true;
        }else{
            return false;
        }

    }
}
