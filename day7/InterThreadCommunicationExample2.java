package com.celcom.day7;

import java.util.Scanner;

class SavingAccount {
	private long balanceAmount;

	public void withdraw(long amount) {
		balanceAmount -= amount;
	}

	public void deposit(long amount) {
		balanceAmount += amount;
	}

	public long getBalance() {
		return balanceAmount;
	}
}


class Withdrawer extends Thread {
	long amount;
	SavingAccount account;
	Scanner in = new Scanner(System.in);

	Withdrawer(SavingAccount account) {
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			System.out.println("The Withdrawer is waiting for amount to be deposited");
			try {
				account.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Enter the Amount to be Withdrawed");
			long amount = in.nextLong();
			account.withdraw(amount);
			System.out.println("Withdrawel is Successfull");
			System.out.println("Balance :" + account.getBalance());

		}
	}
}

class Depositer extends Thread {
	Scanner in = new Scanner(System.in);
	SavingAccount account;

	Depositer(SavingAccount account) {
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			System.out.println("Enter the amount to be Deposited");
			long amount = in.nextLong();
			account.deposit(amount);
			System.out.println("Money Successfully Deposited");
			account.notify();
			System.out.println("Balance : " + account.getBalance());
		}
	}
}

public class InterThreadCommunicationExample2 {

	public static void main(String[] args) {
		SavingAccount account=new SavingAccount();
		Withdrawer withdraw=new Withdrawer(account);
		withdraw.start();
		Depositer deposit=new Depositer(account);
		deposit.start();
	}

}
