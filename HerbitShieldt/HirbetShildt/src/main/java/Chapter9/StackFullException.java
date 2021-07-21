/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author rosso
 */
public class StackFullException extends Exception{
   int size;  
    
  StackFullException(int s) { size = s; }  
  
  public String toString() {  
   return "\nStack is full. Maximum size is " +  
           size;  
  } 
}
