/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author rosso
 */
// Count spaces.
public class Spaces {
    public static void main(String args[])  
    throws java.io.IOException { 
 
    char ch; 
    int spaces = 0; 
 
 
    System.out.println("Enter a period to stop."); 
 
    do { 
      ch = (char) System.in.read(); 
      if(ch == ' ') spaces++; 
    } while(ch != '.'); 
 
    System.out.println("Spaces: " + spaces); 
  } 
}
