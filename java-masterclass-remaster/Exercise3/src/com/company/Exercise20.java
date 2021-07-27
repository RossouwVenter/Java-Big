package com.company;

public class Exercise20 {

    public static int getGreatestCommonDivisor (int first, int second) {
        int commonDiv = 0;
        int minNum = 0;
        int maxNum = 0;
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        if (first > second) {
            maxNum = first;
            minNum = second;
        } else {
            maxNum = second;
            minNum = first;
        }
        for (int i = maxNum; i >= 1; i--) {
            if ((maxNum % i == 0) && (minNum % i == 0)) {
                commonDiv = i;
                break;
            }
        }
        return commonDiv;
    }
}
