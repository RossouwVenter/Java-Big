/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

/**
 *
 * @author rosso
 */
public class Employees {    
    public Employees (String name,String department, char gender, double salary, int hoursWorked,double overTime,double TSalary){
        super (name,department,gender,salary, hoursWorked,overTime,TSalary);
    }
    
    public static void main(String[] args) {        
      Employees HR1 = new Employees("Chris","HR",'M',500000.50,2000,20);  
      Employees Manager1 = new Employees("Emily","Manager",'F',750000.50,2500,40);
      Employees Tellers1 = new Employees("Bob","Tellers",'M',20000.50,1500,5);
    
      
      HR1.display();
      Manager1.display();
      Tellers1.display();
    }
    
}
