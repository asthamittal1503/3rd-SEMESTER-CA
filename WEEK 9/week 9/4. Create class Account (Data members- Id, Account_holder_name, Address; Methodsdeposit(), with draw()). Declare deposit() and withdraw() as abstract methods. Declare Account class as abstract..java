package com.mycompany.abstracts;
abstract class Account {
    int Id;
    String Account_holder_name;
    String Address;

    Account(int id, String name, String address) {
        Id = id;
        Account_holder_name = name;
        Address = address;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {

    SavingsAccount(int id, String name, String address) {
        super(id, name, address);
    }

    void deposit(double amount) {
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amount) {
        System.out.println("Amount withdrawn: " + amount);
    }
}

public class Abstracts {
    public static void main(String[] args) {

        SavingsAccount a = new SavingsAccount(
            101,
            "Astha Mittal",
            "Lucknow"
        );

        System.out.println("Account ID: " + a.Id);
        System.out.println("Account Holder Name: " + a.Account_holder_name);
        System.out.println("Address: " + a.Address);

        a.deposit(10000);
        a.withdraw(3000);
    }
}
