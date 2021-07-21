/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

/**
 *
 * @author rosso
 */
public class Shirt {

    public String description;
    public char colorCode;
    public double price;

    public Shirt() {
        this.description = description;
        setColorCode(color);
        this.price = price;
    }

    public String display() {
        System.out.println("Shirt description: " + description);
        System.out.println("Color code: " + colorCode);
        System.out.println("Shirt price: " + price);
    }
//    getting the color.

    public void setColorCode(char theColor) {
        if (theColor.length() > 0) {
            colorCode = theColor.charAt(0);
        }
    }
}
