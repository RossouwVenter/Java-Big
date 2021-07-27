package com.company;

public class Exercise21 {

    public static void main(String[] args) {
        printFactors(32);
    }

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid value");
        }
        int divider = 1;
        while (divider <= number) {
           if (number % divider == 0){
               System.out.println(divider);
           }
            divider++;
        }

    }


//    public static void printFactors(int number){
//        if(number<1) System.out.println("Invalid Value");
//        int factor = 1;
//        while(factor <= number){
//            if(number%factor==0) System.out.println(factor);
//            factor++;
//        }
//    }

}
