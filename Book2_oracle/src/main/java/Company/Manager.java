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
public class Manager {
    private String name;
    private String department;
    private char gender;
    private double salary;
    private int hoursWorked;
    private double TSalary;
    private double overTime;
    
    public void display() {
        System.out.println("Managers name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Managers gender: " + gender);
        System.out.println("Managers basic salary: " + salary);
        System.out.println("Total hours worked overtime: " + hoursWorked);
        System.out.println("Managers Total salary: " + TSalary);
        System.out.println("Managers Overtime bonus: " + overTime);
    }

    public Manager(String name,String department, char gender, double salary, int hoursWorked,double overTime, double TSalary) {
            this.name = name;
            this.department = department;
            this.gender = gender;
            this.hoursWorked = hoursWorked;
            this.salary = salary;
            this.TSalary =1000*overTime;
    }
}
