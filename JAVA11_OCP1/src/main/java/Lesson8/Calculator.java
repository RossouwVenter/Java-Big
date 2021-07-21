/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

/**
 *
 * @author rosso
 */
public class Calculator {
    public float total;
    
    public static int sum (int num1, int num2) {
        total = num1 + num2;
        return total;
    }
    public static int sum (int num1, int num2,int num3) {
        total = num1 + num2 + num3;
        return total;
    }
    
    public static int sum (int num1, int num2,int num3,int num4) {
        total = num1 + num2 + num3 + num4;
        return total;
    }
    
    
}
