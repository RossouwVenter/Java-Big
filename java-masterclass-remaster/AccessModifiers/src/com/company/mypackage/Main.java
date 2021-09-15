package com.company.mypackage;

public class Main {

    public static void main(String[] args) {
        Account rossouwAccount = new Account("Rossouw");
        rossouwAccount.deposit(1000);
        rossouwAccount.withdraw(500);
        rossouwAccount.withdraw(-200);
        rossouwAccount.deposit(-20);
        rossouwAccount.calculateBalance();
//	rossouwAccount.balance = 5000;

        System.out.println("Balance on account is " + rossouwAccount.getBalance());
//        rossouwAccount.transactions.add(4500);
        rossouwAccount.calculateBalance();
    }
}
