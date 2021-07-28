package com.company;

import java.util.Scanner;

public class ReaderUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        while (number >= 1){
            System.out.println("Enter the number #" + number);
            int inputNum = scanner.nextInt();
            if (inputNum == number){
                scanner.nextLine();
                number++;
            } else {
                System.out.println("Not the same number!");
            }

        }

        scanner.close();
    }
}
