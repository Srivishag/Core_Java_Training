package com.celcom.bankingapplication;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank bankManager = new Bank();
        while (true) {
            System.out.println("\nWelcome to Bank of Celcom");
            System.out.println("Please choose an option from below:");
            System.out.println("1. Open Account");
            System.out.println("2. Close Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. End Service");
            System.out.print("Enter your choice: ");

            // Validate input
            if (!in.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                in.nextLine(); // Consume invalid input
                continue;
            }

            int choice = in.nextInt();
            in.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    bankManager.addAccount();
                    break;
                case 2:
                    bankManager.removeAccount();
                    break;
                case 3:
                    bankManager.deposit();
                    break;
                case 4:
                    bankManager.withdraw();
                    break;
                case 5:
                    bankManager.checkBalance();
                    break;
                case 6:
                    System.out.println("Thank You for Using Our Service 🙏");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }
}
