package com.company;

public class Exercise4 {

    public static void main(String[] args) {
        int year = 1924;

        boolean leapyear = isLeapYear(year);
        System.out.println(year + " is a leap year " + leapyear);
    }

    public static boolean isLeapYear(int year){
        if ((year < 1) || (year > 9999)){
            return false;
        }else{
            if (year % 4 == 0){
              if (year % 100 == 0){
                  if (year % 400 == 0){
                      return true;
                  }else {
                      return false;
                  }
              }else {
                  return true;
              }
            }else {
                return false;
            }
        }

    }
}
