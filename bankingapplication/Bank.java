package com.celcom.bankingapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    static ArrayList<Account> accountsManager = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    // Method to add a new account
    static void addAccount() {
        System.out.println("Enter Your Name: ");
        String name = in.nextLine();
        System.out.println("Enter Your Account Number: ");
        long accountNumber = in.nextLong();
        System.out.println("Enter Your Pin: ");
        int pin = in.nextInt();
        System.out.println("Enter Your Initial Deposit: ");
        int balance = in.nextInt();
        in.nextLine(); // Consume newline character
        accountsManager.add(new Account(name, accountNumber, pin, balance));
        System.out.println("Account Created Successfully!");
    }

    // Method to remove an account
    static void removeAccount() {
        System.out.println("Enter Your Account Number: ");
        long accountNumber = in.nextLong();
        System.out.println("Enter Your Pin: ");
        int pin = in.nextInt();

        boolean removed = accountsManager.removeIf(account -> 
            account.getAccountNumber() == accountNumber && account.getPin() == pin
        );

        if (removed) {
            System.out.println("Account Removed Successfully!");
        } else {
            System.out.println("Invalid Account Number or PIN.");
        }
    }

    // Method to deposit money
    static void deposit() {
        System.out.println("Enter Your Account Number: ");
        long accountNumber = in.nextLong();
        System.out.println("Enter Your Amount: ");
        int amount = in.nextInt();

        for (Account account : accountsManager) {
            if (account.getAccountNumber() == accountNumber) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Deposit Successful!");
                return;
            }
        }
        System.out.println("Account Not Found.");
    }

    // Method to withdraw money
    static void withdraw() {
        System.out.println("Enter Your Account Number: ");
        long accountNumber = in.nextLong();
        System.out.println("Enter Your Pin: ");
        int pin = in.nextInt();
        System.out.println("Enter Your Amount: ");
        int amount = in.nextInt();

        for (Account account : accountsManager) {
            if (account.getAccountNumber() == accountNumber && account.getPin() == pin) {
                if (amount > account.getBalance()) {
                    System.out.println("Insufficient Balance.");
                } else {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("Withdrawal Successful!");
                }
                return;
            }
        }
        System.out.println("Invalid Account Number or PIN.");
    }

    // Method to check balance
    static void checkBalance() {
        System.out.println("Enter Your Account Number: ");
        long accountNumber = in.nextLong();

        for (Account account : accountsManager) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Account Balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account Not Found.");
    }
}
