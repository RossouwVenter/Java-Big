package Lesson9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author rosso
 */
public class Customer {
   public String name = "will Smith";
   public int custID = 255;
   public String address;
   public int orderNum;
   public int age;
   public String ssn;
   
    public void displayCustomer(String[] args) {
        System.out.println("Customer: " + name);
    }
    
    public Customer(String name, String ssn){
        this.name = name;
        this.ssn = ssn;    
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = name;
    }
    
    
}
