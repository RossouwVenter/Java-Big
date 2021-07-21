/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author rosso
 */
public class TwiDimensionalArray {
    public static void main(String[] args) {
        int sales[][]= new int[3][4];
        
        sales[0][0] = 1;
        sales[0][1] = 2;
        sales[0][2]= 3;
        sales[1][0] = 4;
        sales[1][1] = 5;
        sales[1][2]= 6;
        sales[2][0] = 7;
        sales[2][1] = 8;
        sales[2][2]= 9;
        
        System.out.println("Sales:");
        for (int i=0 ;i < sales.length; i++){
            for (int j=0 ;j < sales[i].length; j++){
            System.out.println("\tQ"+(j+1)+ " " + sales[i][j]);
        }
            
        }
        
    }
}
