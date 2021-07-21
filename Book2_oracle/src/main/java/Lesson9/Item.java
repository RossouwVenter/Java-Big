/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9;

/**
 *
 * @author rosso
 */
public class Item {
    private int id;
    private String desc;
    private double price;
//    private static int nextId = 1;
    
    
    
//    public Item(){
//        setId();
//        desc = "--description--";
//        price = 0.00;
//    }
//    
//    private void setId(){
//        id = Item.nextId++;
//    }
    
//        private double price = 15.50;
//        public void setPrice(double price) {
//            this.price = price;
//        }

    public int getId() {        
        return id ;
    }

    public void setId(int id) { 
        if ((id >= 100)&&(id <=300)){
        this.id = id;
        }
        else{
            System.out.println("Incorrect ID. the ID should be between 100 and 300");
        }            
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
