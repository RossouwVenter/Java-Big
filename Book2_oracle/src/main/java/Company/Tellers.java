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
public class Tellers {

    private String name;
    private String department;
    private char gender;
    private double salary;
    private int hoursWorked;
    private double TSalary;
    private double overTime;

    public void display() {
        System.out.println("Tellers name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Tellers gender: " + gender);
        System.out.println("Tellers basic salary: " + salary);
        System.out.println("Total hours worked overtime: " + hoursWorked);
        System.out.println("Tellers Total salary: " + TSalary);
        System.out.println("Tellers Overtime bonus: " + overTime);
    }

    public Tellers(String name, char gender, double salary, int hoursWorked, double TSalary,double overTime) {
            this.name = name;
            this.department = department;
            this.gender = gender;
            this.hoursWorked = hoursWorked;
            this.salary = salary;
            this.TSalary = 10*overTime;
    }
}
