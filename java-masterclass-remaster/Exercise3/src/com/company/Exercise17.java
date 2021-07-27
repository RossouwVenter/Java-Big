package com.company;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }
    public static int getEvenDigitSum(int number){

        int evenNumber = 0;
        int digit = 0;

        if (number < 0){
            return -1;
        }else {
            while (number > 0){
                digit = number % 10;
                if ((digit % 2) == 0){
                    evenNumber += digit;
                }
                number /= 10;
            }
            return evenNumber;
        }

    }
}
