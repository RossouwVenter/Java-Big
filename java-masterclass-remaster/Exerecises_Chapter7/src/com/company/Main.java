package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }

    public static int[] readIntegers(int count){
        System.out.println("Please enter the numbers.");

        int[] arrayEntered = new int[count];

        for (int i =0;i<arrayEntered.length;i++){
            System.out.println("Please enter the numbers.");
            int number = scanner.nextInt();
            scanner.nextLine();
            arrayEntered[i] = number;
        }
        return arrayEntered;
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
}
