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
public class HR  {
     private String name;
     private String department;
    private char gender;
    private double salary;
    private int hoursWorked;
    private double overTime;
    private double TSalary;
    
    public void display() {
        System.out.println("HR name: " + name);
        System.out.println("Department: " + department);
        System.out.println("HR gender: " + gender);
        System.out.println("HR basic salary: " + salary);
        System.out.println("Total hours worked overtime: " + hoursWorked);
        System.out.println("HR Total salary: " + TSalary);
        System.out.println("HR Overtime bonus: " + overTime);
    }

    public HR(String name, char gender, double salary, int hoursWorked,double overTime, double TSalary) {
            this.name = name;
            this.department = department;
            this.gender = gender;
            this.hoursWorked = hoursWorked;
            this.salary = salary;
            this.TSalary = 750*overTime;
    }
    
}
