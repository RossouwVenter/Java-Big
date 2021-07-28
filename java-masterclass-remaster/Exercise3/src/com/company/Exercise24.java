package com.company;

public class Exercise24 {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 6));
    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int sum = (bigCount * 5) + (smallCount);

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else {

            for (int i = smallCount *1; i >= 0; i--){
                for (int j = bigCount * 5; j >= 0; i -= 5){
                    if (i+j == goal){
                        return true;
                    }
                }
            }
            return false;
        }

    }
}
