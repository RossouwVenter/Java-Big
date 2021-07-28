package com.company;

public class Exercise22 {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;

        if (number < 1){
            return false;
        } else {
            int divider = 1;

            do{
                if (number % divider == 0){
//                    System.out.println("Sum is: " + sum);
                    sum += divider;
                }
                divider++;
            }
            while (divider < number);
        }

        if (sum == number){
            return true;
        } else {
            return false;
        }
    }
}
