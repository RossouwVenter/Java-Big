package com.company;

import java.util.Scanner;

public class Min_Elements {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        readIntegers();
//        readElements();
//        int[] returnedArray = readElements();
//        int returnedMin = findMin(returnedArray);
//
//        System.out.println("min = " + returnedMin);
    }

    public static int readIntegers(){
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the numbers.");
        return count;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0;i<array.length;i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }
    public static int[] readElements(int number){

        int[] arrayEntered = new int[number];
        for (int i =0;i<arrayEntered.length;i++){
            System.out.println("Please enter the numbers.");
             int numbersEntered = scanner.nextInt();
            scanner.nextLine();
            arrayEntered[i] = numbersEntered;
        }
        return arrayEntered;
    }
}
