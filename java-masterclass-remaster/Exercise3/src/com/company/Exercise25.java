package com.company;

public class Exercise25 {


    public static int getLargestPrime(int number) {

        int largestPrime = -1;
        int count = 2;
        int temp = number;

        if (number <= 1) {
            return -1;
        }

        for (int i = 1; i <= number; i++) {
            if (temp % count !=0) {
                count++;
            } else {
                largestPrime = temp;
                temp /= count;
                if (temp == 1) {
                    return largestPrime;
                }
            }
        }

        return largestPrime;

    }
}
