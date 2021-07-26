package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        }else if (value == 2){
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 1;


        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5 :
                System.out.println("was a 3,4 or a 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char character = 'F';

        switch (character){
            case 'A':
                System.out.println("'A' has been found!");
                break;
            case 'B':
                System.out.println("'B' has been found!");
                break;
            case 'C':
                System.out.println("'C' has been found!");
                break;
            case 'D':
                System.out.println("'D' has been found!");
                break;
            case 'E':
                System.out.println("'E' has been found!");
                break;
            default:
                System.out.println("Not 'A','B','C','D' or 'E' has been found but "+ character);
        }


//        more code here
    }
}
