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
public class InnerLoop {
    public static void main(String[] args) {
        int height = 4, width = 10;
        
       for (int i = 0; i < height; i++){
           for(int x = 0; x <width; x++){
               System.out.print("@");
           }
           System.out.println("");
       }
    }
      
    
}
