/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

import Lesson12.*;

/**
 *
 * @author rosso
 */
public class Clothing {
    private String color;
    private char size;
    private String type;
    private double price;
    
    public void display(){
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        
    }
//    Same as setters and getter method
    public Clothing(String color, char size, String type, double price){        
        this.color = color;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    
    
    
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public char getSize() {
//        return size;
//    }
//
//    public void setSize(char size) {
//        this.size = size;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
    
   
}
