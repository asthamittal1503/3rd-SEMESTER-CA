package com.mycompany.bank;
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

class Saving extends Account {
    double Min_balance;

    Saving(int id, String name, String address, double min_balance) {
        super(id, name, address);
        Min_balance = min_balance;
    }

    void display() {
        System.out.println("----- Saving Account -----");
        System.out.println("Account ID: " + Id);
        System.out.println("Account Holder Name: " + Account_holder_name);
        System.out.println("Address: " + Address);
        System.out.println("Minimum Balance: " + Min_balance);
    }

    void deposit(double amount) {
        System.out.println("Saving Account Deposit: " + amount);
    }

    void withdraw(double amount) {
        System.out.println("Saving Account Withdraw: " + amount);

        if (amount <= Min_balance) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Cannot withdraw: Minimum balance requirement.");
        }
    }
}

class Current extends Account {
    double Max_withdrawl_limit;

    Current(int id, String name, String address, double max_withdrawl_limit) {
        super(id, name, address);
        Max_withdrawl_limit = max_withdrawl_limit;
    }

    void display() {
        System.out.println("----- Current Account -----");
        System.out.println("Account ID: " + Id);
        System.out.println("Account Holder Name: " + Account_holder_name);
        System.out.println("Address: " + Address);
        System.out.println("Maximum Withdrawal Limit: " + Max_withdrawl_limit);
    }

    void deposit(double amount) {
        System.out.println("Current Account Deposit: " + amount);
    }

    void withdraw(double amount) {
        System.out.println("Current Account Withdraw: " + amount);

        if (amount <= Max_withdrawl_limit) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {

        Saving s = new Saving(
            101,
            "Rahul Kumar",
            "Lucknow",
            5000
        );

        Current c = new Current(
            102,
            "Amit Sharma",
            "Kanpur",
            20000
        );

        s.display();
        s.deposit(10000);
        s.withdraw(3000);

        System.out.println();

        c.display();
        c.deposit(25000);
        c.withdraw(15000);
    }
}

