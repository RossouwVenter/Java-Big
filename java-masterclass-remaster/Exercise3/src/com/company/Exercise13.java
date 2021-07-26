package com.company;

public class Exercise13 {
    public static boolean isLeapYear(int year) {
        // Validate parameter
        if (year < 1 || year > 9999) {
            System.out.println("Invalid Parameter");
            return false;
        }

        // check conditions
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        // Validate Parameters
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        // Special Case: February
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }

        switch (month) {
            // Case for months with 31 days
            // Jan Mar May Jul Aug Oct Dec
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            // Can use default for all other cases/months
            default:
                return 30;
        }
    }
}
