/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author rosso
 */
public class Shirt extends Clothing {
    private int neckSize;

    public Shirt(String color, char size, String type, double price,int neckSize) {
        super (color, size, type, price);        
        this.neckSize = neckSize;
    }
    
    public int getNeckSize() {
        return neckSize;
    }

    public void setNeckSize(int neckSize) {
        this.neckSize = neckSize;
    }
    
    
    public static void main(String[] args) { 
       Shirt myShirt = new Shirt("Blue",'L',"Gold Shirt",999.99, 12);
//       Shirt myShirt = new Shirt();
//       myShirt.setColor("Blue");
//       myShirt.setSize('L');
//       myShirt.setType("Gold Shirt");
//       myShirt.setPrice(999.99);
       
       myShirt.display();
        System.out.println("Neck Size: " + myShirt.getNeckSize());       
    }
}
