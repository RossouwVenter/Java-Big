/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersise5;

/**
 *
 * @author rosso
 */
public class excersise5 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Cart!");
        
        int quantity = 0;
        boolean outofStock;
        
        if (quantity >= 1){
            outofStock = false;
        }
        else {
            outofStock = true;
        }
        System.out.println("If true there is stock left otherwsie it is "
                + "finished  " + outofStock);
        
    }
    
    
}
