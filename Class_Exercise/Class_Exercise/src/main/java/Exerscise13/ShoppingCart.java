/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerscise13;

/**
 *
 * @author rosso
 */
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};       
        
        // Convert the days array into an ArrayList
        ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
        // Loop through the ArrayList, printing out "sunday" elements in 
        
        for (String s : dayList){
            if (s.equals("sunday")){
                System.out.println(s.toUpperCase());   
            }else System.out.println(s);            
        }
        System.out.println(dayList);
        //   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList  



    }
}
