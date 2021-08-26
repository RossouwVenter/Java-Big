package com.company;

public class Main {

    public static void main(String[] args) {
	int[] myIntArray = new int[10];
	 myIntArray[5] = 50;
	 myIntArray[0] = 45;

	 int[] myNewIntArray = {1,2,3,4,5,6,7,8,9,10};

	 int[] lastIntArray = new int[10];
	for(int i = 0; i<lastIntArray.length; i++){
//	    lastIntArray[i] = i *10;
        lastIntArray[i] = i;
        }

//	for (int i = 0; i<lastIntArray.length; i++) {
//        System.out.println("Element " + i + " value is " + lastIntArray[i]);
//    }

	 double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        System.out.println(myNewIntArray[6]);

        printArray(lastIntArray);
    }
    public static void printArray(int[]array){
        for (int i = 0; i<array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
}
