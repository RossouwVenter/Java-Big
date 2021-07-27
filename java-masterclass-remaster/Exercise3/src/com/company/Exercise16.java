package com.company;

public class Exercise16 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }

    public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int lastDigit = 0;
        int sum = 0;

        if (number < 0){
            return -1;
        }else {
            firstDigit = number % 10;

            while ( number > 0) {
                lastDigit = number % 10;
                number /= 10;
            }
            sum = firstDigit + lastDigit;
            return sum;

        }
    }
}
