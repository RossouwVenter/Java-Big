
import Lesson9.Customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author rosso
 */
public class myClass {
//    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        
        customer1.age = 40;
        customer2.name = "Duke";
        
        customer1.displayCustomer();
        customer2.displayCustomer();
        
    }
    
}
