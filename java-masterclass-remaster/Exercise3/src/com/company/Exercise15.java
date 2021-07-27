package com.company;

public class Exercise15 {
    public static boolean isPalindrome(int number){
        int reverse = 0;

        if (number < 0){
            number *= -1;
        }

        int stored = number;
        while (stored > 0 ){
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;

            stored /= 10;
        }

        if (number == reverse) {
            return true;
        }else {
            return false;
        }
    }
}
