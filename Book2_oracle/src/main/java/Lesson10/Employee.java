/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10;

/**
 *
 * @author rosso
 */
public class Employee {

//    public String name1 = "Fred Smith";
//    public String name2 = "fred Smith";
     public String name1 = new String("Fred Smith");
    public String name2 = new String("Fred Smith");

    public void areNameEqual() {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Same Name");
        } else {
            System.out.println("Diffrent name");
        }        
//        String result= (name1 == name2)? "Same Name": "Diffrent Names";
        
//        System.out.println(result);
//    }
    
}
}

