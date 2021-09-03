package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.55);

        bank.listCustomers("Adelaide", false);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 5.55)) {
            System.out.println("ErrorMelbourne branch does not exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus",52.13)){
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Adelaide","Tim",12.21)){
            System.out.println("Customer Tim already exists");
        }

    }
}
