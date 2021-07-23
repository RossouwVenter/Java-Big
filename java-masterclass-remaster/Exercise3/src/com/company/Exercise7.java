package com.company;

public class Exercise7 {

    public static void main(String[] args) {

        boolean number = hasTeen(9,99,19);
        System.out.println(number);
    }

    public static boolean hasTeen(int num1,int num2,int num3){
        if ((num1 | num2 | num3) >= 13 && (num1 | num2 | num3) <= 19){
            return true;
        }
            return false;

    }

}
