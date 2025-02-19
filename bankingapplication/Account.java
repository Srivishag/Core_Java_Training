package com.celcom.bankingapplication;

public class Account {
    // Private fields for encapsulation
    private String name;
    private long accountNumber;
    private int pin;
    private int balance;

    // Constructor to initialize account details
    public Account(String name, long accountNumber, int pin, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Account Number
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for PIN (Consider security measures when handling PINs)
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    // Getter and Setter for Balance
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
