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
// Change case.
public class CaseChg {
    public static void main(String args[])  
    throws java.io.IOException { 
    char ch; 
    int changes = 0; 
 
    System.out.println("Enter period to stop."); 
 
    do { 
      ch = (char) System.in.read(); 
      if(ch >= 'a' & ch <= 'z') { 
        ch -= 32; 
        changes++; 
        System.out.println(ch); 
      } 
      else if(ch >= 'A' & ch <= 'Z') { 
        ch += 32; 
        changes++; 
        System.out.println(ch); 
      } 
    } while(ch != '.'); 
    System.out.println("Case changes: " + changes); 
  } 
}
