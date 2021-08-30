package com.company;

import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    public static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));

        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        for(int i = 0;i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
