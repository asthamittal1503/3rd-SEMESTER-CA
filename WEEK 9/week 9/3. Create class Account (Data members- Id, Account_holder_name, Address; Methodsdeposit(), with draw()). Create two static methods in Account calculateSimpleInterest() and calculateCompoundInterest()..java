package com.mycompany.statics;
class Account {
    int Id;
    String Account_holder_name;
    String Address;

    Account(int id, String name, String address) {
        Id = id;
        Account_holder_name = name;
        Address = address;
    }

    void deposit(double amount) {
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amount) {
        System.out.println("Amount withdrawn: " + amount);
    }

    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}

public class Statics {
    public static void main(String[] args) {
        Account a = new Account(
            101,
            "Rahul Kumar",
            "Lucknow"
        );

        System.out.println("Account ID: " + a.Id);
        System.out.println("Account Holder Name: " + a.Account_holder_name);
        System.out.println("Address: " + a.Address);

        a.deposit(10000);
        a.withdraw(2000);

        double simpleInterest =
            Account.calculateSimpleInterest(10000, 5, 2);

        double compoundInterest =
            Account.calculateCompoundInterest(10000, 5, 2);

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
