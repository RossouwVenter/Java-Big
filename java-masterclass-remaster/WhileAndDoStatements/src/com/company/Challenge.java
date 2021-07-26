package com.company;

public class Challenge {
    public static void main(String[] args) {
//        System.out.println(isEvenNumber(5));

     int number = 4;
     int finishNumber = 20;
     int evenNumbersFound = 0;

     while (number <= finishNumber) {
         number++;
         if (!isEvenNumber(number)) {
             continue;
         }

         System.out.println("Even number " + number);

         evenNumbersFound ++;
         if (evenNumbersFound >= 5){
             break;
         }


     }

        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number){
        while (number % 2 == 0){
            return true;
        }

        return false;
    }

}
