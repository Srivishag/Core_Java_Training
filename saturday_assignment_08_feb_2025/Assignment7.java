package com.celcom.saturday_assignment_08_feb_2025;

import java.util.ArrayList;
import java.util.Scanner;

class Bank {
	static ArrayList<Account> accountsManager = new ArrayList<>();
	static Scanner in = new Scanner(System.in);

	static void addAccount() {
		System.out.println("Enter Your Name : ");
		String name = in.nextLine();
		System.out.println("Enter Your Account Number : ");
		long accountNumber = in.nextLong();
		System.out.println("Enter Your Pin : ");
		int pin = in.nextInt();
		System.out.println("Enter Your initial Deposit : ");
		int balance = in.nextInt();
		accountsManager.add(new Account(name, accountNumber, pin, balance));
		System.out.println("Success");

	}

	static void removeAccount() {
		System.out.println("Enter Your Account Number : ");
		long accountNumber = in.nextLong();
		System.out.println("Enter Your Pin : ");
		int pin = in.nextInt();
		accountsManager.removeIf(account -> account.accountNumber == accountNumber && account.pin == pin);
		System.out.println("Success");

	}

	static void deposit() {
		System.out.println("Enter Your Account Number: ");
		long accountNumber = in.nextLong();
		System.out.println("Enter Your Amount : ");
		int amount = in.nextInt();
		for (Account account : accountsManager) {
			if (account.accountNumber == accountNumber) {
				account.balance += amount;
				System.out.println("Success");
				break;
			}
		}
	}

	static void withdraw() {
		System.out.println("Enter Your Account Number : ");
		long accountNumber = in.nextLong();
		System.out.println("Enter Your Pin : ");
		int pin = in.nextInt();
		System.out.println("Enter Your Amount : ");
		int amount = in.nextInt();
		for (Account account : accountsManager) {
			if (account.accountNumber == accountNumber && account.pin == pin) {
				account.balance -= amount;
				System.out.println("Success");
				break;
			}
		}

	}

	static void checkBalance() {
		System.out.println("Enter your Account Number");
		long accountNumber = in.nextLong();
		for (Account account : accountsManager) {
			if (account.accountNumber == accountNumber) {
				System.out.println("Account Balance is : " + account.balance);
				break;
			}
		}
	}
}

class Account {
	String name;
	long accountNumber;
	int pin;
	int balance;

	public Account(String name, long accountNumber, int pin, int balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;
	}

}

public class Assignment7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome to Bank of Celcom");
			System.out.println("Please choose any Options from below");
			System.out.println(
					"1.Open Account \n2.Close Account \n3.Deposit \n4.WithDraw \n5.Check Balance \n6.End Service");
			int n = in.nextInt();
			switch (n) {
			case 1:
				Bank.addAccount();
				break;
			case 2:
				Bank.removeAccount();
				break;
			case 3:
				Bank.deposit();
				break;
			case 4:
				Bank.withdraw();
				break;
			case 5:
				Bank.checkBalance();
				break;
			case 6:
				System.out.println("Thank You For Using Our Service 🙏");
				in.close();
				return;

			}
		}
	}

}
