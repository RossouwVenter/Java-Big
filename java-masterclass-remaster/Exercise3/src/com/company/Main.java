package com.company;

public class Main {

    public static void main(String[] args) {
	shouldWakeUp(true,1);
    }
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if ( hourOfDay < 8 || hourOfDay > 22 ) {
            barking = true;
        } else if (hourOfDay < 0 && hourOfDay > 23) {
            barking = false;
        }

            return false;

    }

}
