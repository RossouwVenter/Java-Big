package com.company;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number){

        if(number < 10){
            return -1;
        }else{
            int sum = 0;

//            125 - 125 /10 = 12 * 10 = 120 -> 125 -120 = 5
            while (number > 0){
//                extract th eleast significant digit
                int digit = number % 10;
                sum += digit;

//                drop leat-significant digit
                number /= 10;
            }

            return sum;
        }
    }
}
