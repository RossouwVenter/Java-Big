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
public class Customer {
    private String name;
    private String ssn;
    
    public Customer(String name, String ssn){
        this.name = name;
        this.ssn = ssn;    
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
    
}
