package com.celcom.day13.Task1;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CustomerManager manager = new CustomerManager();
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add new Customer");
			System.out.println("2. Delete a Customer");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Display Customers");
			int choice = in.nextInt();
			switch(choice) {
			case 1:
				manager.addCustomer();
				break;
			case 2:
				manager.deleteCustomer();
				break;
			case 3:
				manager.deposit();
				break;
			case 4:
				manager.withdraw();
				break;
			case 5:
				System.out.println("Choose an Option");
				System.out.println("1.Display All Customers");
				System.out.println("2.Display Customer based on Balance");
				int displayChoice = in.nextInt();
				switch(displayChoice) {
				case 1:
					manager.displayAllCustomer();
					break;
				case 2:
					manager.displayCustomerByBalance();
				}
				break;
			
			default:
				System.out.println("Thank you....!");
				return;
			}
		}
	}
}
