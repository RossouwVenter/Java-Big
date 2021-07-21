/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author rosso
 */
enum Tools { 
  SCREWDRIVER, WRENCH, HAMMER, PLIERS  
}
public class ShowEnum {
    public static void main(String args[]) { 
    for(Tools d : Tools.values())  
      System.out.print(d + " has ordinal value of " + 
                       d.ordinal() + '\n'); 
       
  }
}
