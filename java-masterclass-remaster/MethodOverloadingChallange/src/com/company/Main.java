package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calcFeetAndInchedToCentimeters(6,0);

        calcFeetAndInchedToCentimeters(100);
    }

    public static double calcFeetAndInchedToCentimeters(double feet,double inches){

        if ((feet < 0) || (inches < 0 || inches > 12)){
            return -1;
        }else{
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches *2.54;
            System.out.println(feet + " feet, " + inches + "inches = " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchedToCentimeters(double inches){
        if (inches >= 0){

            double feet = (int) inches /12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " +remainingInches + " inches");
            return calcFeetAndInchedToCentimeters(feet, remainingInches);

        }

        return -1;
    }
}
