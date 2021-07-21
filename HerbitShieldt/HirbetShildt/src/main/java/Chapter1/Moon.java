/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/*    
   Compute your weight on the moon.  
   
   Call this file Moon.java.   
*/

/**
 *
 * @author rosso
 */
public class Moon {
    public static void main(String args[]) {    
    double earthweight; // weight on earth  
    double moonweight; // weight on moon   
   
    earthweight = 165;   
  
    moonweight = earthweight * 0.17;  
   
    System.out.println(earthweight + " earth-pounds is equivalent to " +  
                       moonweight + " moon-pounds.");    
   
  }  
}
