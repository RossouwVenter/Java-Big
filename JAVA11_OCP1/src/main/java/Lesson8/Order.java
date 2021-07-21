/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

import Lesson9.Customer;
import Lesson9.Item;

/**
 *
 * @author rosso
 */
public class Order {
    public static void main(String[] args) {
        Customer cust = new Customer();
        Item item = new Item();
//        item1.price = 10.00;
        item.setPrice(10.00);
        item.setId(155);
        item.setDesc("White Golf Balls");
        
        
        System.out.println("The price: " + item.getPrice());
        System.out.println("Item ID: " + item.getId());
        System.out.println("Item Description: " + item.getDesc());
    }
}
