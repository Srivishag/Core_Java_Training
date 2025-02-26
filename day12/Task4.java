package com.celcom.day12;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CustomerManager manager = new CustomerManager();
		while (true) {
			System.out.println("Customer Management System");
			System.out.println("Choose an Option:");
			System.out.println("1.Add customer");
			System.out.println("2.Remove Customer");
			System.out.println("3.Update Customer");
			System.out.println("4.View Customer");
			System.out.println("5.Exit");
			int choice = in.nextInt();
			in.nextLine();
			switch (choice) {
			case 1:
				manager.addCustomer();
				break;

			case 2:
				manager.removeCustomer();
				break;
			case 3:
				manager.updateCustomer();
				break;
			case 4:
				manager.viewCustomer();
				break;
			case 5:
				in.close();
				return;
			}
		}
	}
}
