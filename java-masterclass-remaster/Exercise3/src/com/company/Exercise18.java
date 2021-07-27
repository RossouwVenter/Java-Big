package com.company;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }
    public static boolean hasSharedDigit(int numberOne,int numberTwo){
        int digitFirst = 0;
        int digitSecond = 0;

        if ((numberOne >= 10 && numberOne <= 99) &&(numberTwo >= 10 && numberTwo <= 99)) {

            digitFirst = numberOne % 10;
            int stored = numberTwo;
            while (stored > 0){
                digitSecond = stored % 10;
                if (digitFirst == digitSecond){
                    return true;
                }
                stored /= 10;
            }
            numberOne /= 10;
        } else {
            return false;
        }

        return false;
    }
}
