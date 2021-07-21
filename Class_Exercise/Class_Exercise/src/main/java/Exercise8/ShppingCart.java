/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8;

/**
 *
 * @author rosso
 */
public class ShppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Belt", 1, 29.50);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  
        int retcode = item1.setItemFields("Shoes", 2, 500.50, ' ');
                if (retcode < 0) {
                    System.out.println("Invalid color code. Item not added");
                }else {
                    item1.displayItem();
                }
	// Test your code for both valid and invalid values
 
        
        
    }
}
