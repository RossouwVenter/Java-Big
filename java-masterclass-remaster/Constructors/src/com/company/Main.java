package com.company;

import java.security.Permission;

public class Main {

    public static void main(String[] args) {

        Bank fnb = new Bank();
        Bank absa = new Bank(1,0.00,"Bob","bob@gmail.com","0512315562");
        Bank newBank = new Bank();


        System.out.println(newBank.getBalance());
        System.out.println(absa.getCustomerName());

//        fnb.setBalance(5000.50);
//        fnb.setCustomerName("Rossouw");
//        fnb.setEmail("fnb@gmail.com");
//        fnb.setDepositFunds(4999.5);
//        fnb.setWithdrawFunds(10000);
//        fnb.setNumber(6);


        Bank timsBank = new Bank("Tim","tim@email.com","12345");
        System.out.println(timsBank.getNumber() + " name " + timsBank.getCustomerName());

        VIPPerson person1 = new VIPPerson();
        System.out.println(person1.getName());

        VIPPerson person2 = new VIPPerson("Bob",25000.00);
        System.out.println(person2.getName());

        VIPPerson person3 = new VIPPerson("Tim",100.00,"tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
