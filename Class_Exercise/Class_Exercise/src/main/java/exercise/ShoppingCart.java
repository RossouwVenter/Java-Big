/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author rosso
 */
public class ShoppingCart {
//    public static void main(String[] args) {
//        // Declare and initialize 2 Item objects
//        Item item1, item2;
//        item1 = new Item();
//        item2 = new Item();
//        
//	// Print both item descriptions and run code
//	item1.desc = "Shirt";
//        item2.desc = "Pants";
//
//	// Assign one item to another and run it again.
//        item1 = item2;
//        System.out.println("Item1: " + item1.desc);
//        System.out.println("Item2: " + item2.desc);
//
//    } 
    
        public static void main(String args[]){

        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Bob Miller", "555-44-3212");

	// Print the customer object name
        System.out.println("Customer name: "+cust1.getName());
    }  
}
