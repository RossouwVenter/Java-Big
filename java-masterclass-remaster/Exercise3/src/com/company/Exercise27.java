package com.company;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;


        while (true){
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                sum += scanner.nextInt();
                counter++;
            } else {
                break;
            }
        }
        long average = Math.round((double)sum / (double)counter);
        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }

}
