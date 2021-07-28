package com.company;

public class Exercise23 {

    private static final String errorMessage = "Invalid Value";
    public static void numberToWords(int number) {
        int originalNumber = number;
        int count = 0;
        int digit;
        int revNumber = reverse(number);
        int countDigit = getDigitCount(originalNumber);

        if (revNumber < 0) {
            System.out.println(errorMessage);
        }
        while (revNumber > 0) {
            digit = revNumber % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            count++;
            revNumber = revNumber / 10;
        }
        while (count != countDigit) {
            System.out.println("Zero");
            count++;
        }
    }

    public static int reverse(int reverseNum) {
        int reverseNumber = 0;
        while (reverseNum > 0) {
            int lastDigit = reverseNum % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            reverseNum /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number < 0) {
            return -1;
        }	if (number == 0) {
            return 1;
        }
        do {
            digitCount++;
            number = number / 10;
        } while (number > 0);

        return digitCount;
    }
}
