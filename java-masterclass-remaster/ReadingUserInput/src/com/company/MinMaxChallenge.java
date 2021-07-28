package com.company;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");

        boolean hasNextInt = scanner.hasNextInt();

        int minNum = 0;
        int maxNum = 0;
        boolean first = true;

        while (true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

                if (first){
                    first = false;
                    minNum = number;
                    maxNum = number;
                }
                if (number > maxNum) {
                    maxNum = number;
                }

                if (number < minNum){
                    minNum = number;
                }

            }else{
                break;
            }

            scanner.nextLine();
        }

        System.out.println("min = " + minNum + ", max = " + maxNum);

//        while (hasNextInt){
//
//            System.out.println("Enter number:");
//            int number = scanner.nextInt();
//
////            minNum = number;
//            if ( number > minNum && number < maxNum){
//                break;
//            } else if ( number < minNum){
//                minNum = number;
//            } else if (number > maxNum){
//                maxNum = number;
//            }
//            System.out.println("Min number: " + minNum + "\nMax number: " + maxNum );
//        }

        scanner.close();

    }
}
