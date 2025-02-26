package com.celcom.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
		while(true) {
			String emailPattern = "^[A-Za-z\\d_.]+@[A-Za-z\\d_.]+\\.[A-Za-z]{2,}$";
            String passwordPattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z0-9!@#$%^&*()_+=.-]{8,}$";
			String phoneNumberPattern="^[0-9]{10}$";
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a Email:");
			String email=in.next();
			if(!Pattern.matches(emailPattern,email)) {
				System.out.println("Not a Valid Email");
				continue;
			}
			System.out.println("Enter a Password");
			String password=in.next();
			if(!Pattern.matches(passwordPattern,password)) {
				System.out.println("Not a Valid Password");
				continue;
			}
			System.out.println("Enter a Phone Number:");
			String phoneNumber=in.nextLine();
			if(!Pattern.matches(phoneNumberPattern,phoneNumber)) {
				System.out.println("Not a Valid Email");
				continue;
			}
			in.close();
			System.out.println("Email:"+email);
			System.out.println("Password:"+password);
			System.out.println("Phone Number"+phoneNumber);
			return;
		}
		
	}
}
