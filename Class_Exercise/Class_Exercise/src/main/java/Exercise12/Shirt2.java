/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise12;

/**
 *
 * @author rosso
 */
public class Shirt2 extends Item2 {
    private char size;
    private char colorCode;
    
    public Shirt2(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
    
    // Override display() in the superclass to also show size and colorCode.
    //   Avoid duplicating code.
    public void display(){
        super.display();
        System.out.println("Size:" + size);
        System.out.println("Color code: " + colorCode);
    }
    
}
