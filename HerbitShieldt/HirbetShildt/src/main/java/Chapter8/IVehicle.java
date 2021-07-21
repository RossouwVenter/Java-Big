/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author rosso
 */
public interface IVehicle {
   // Return the range.   
  int range(); 
 
  // Compute fuel needed for a given distance.  
  double fuelneeded(int miles);  
 
  // Access methods for instance variables. 
  int getPassengers(); 
  void setPassengers(int p);  
  int getFuelcap(); 
  void setFuelcap(int f);  
  int getMpg(); 
  void setMpg(int m);   
}
