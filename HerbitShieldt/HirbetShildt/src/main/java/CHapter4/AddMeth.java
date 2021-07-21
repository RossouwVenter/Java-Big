/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHapter4;

/**
 *
 * @author rosso
 */
public class AddMeth {
    public static void main(String args[]) {  
    Vehicle minivan = new Vehicle();  
    Vehicle sportscar = new Vehicle();  
 
    int range1, range2;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
  
 
    System.out.print("Minivan can carry " + minivan.passengers + 
                     ". "); 
 
    minivan.range(); // display range of minivan 
 
    System.out.print("Sportscar can carry " + sportscar.passengers + 
                     ". "); 
     
    sportscar.range(); // display range of sportscar. 
  }
}
