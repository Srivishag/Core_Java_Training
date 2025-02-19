package com.celcom.day11;

import java.util.Scanner;

public class MicrowaveHeatingTime {

    static double calculateHeatingTime(int numOfItems, double givenHeatTime, String foodItems, String microwaveModel) {
        double heatTime = 0;

        switch (numOfItems) {
            case 1:
                heatTime = givenHeatTime;
                break;
            case 2:
                heatTime = givenHeatTime + (givenHeatTime * 50 / 100); 
                break;
            case 3:
                heatTime = givenHeatTime * 2;  
                break;
            default:
                System.err.println("Invalid Number of Items");
                return -1; 
        }

        if (foodItems.equalsIgnoreCase("Pasta")) {
            heatTime += (heatTime * 10 / 100);  
        } else if (foodItems.equalsIgnoreCase("Frozen meal")) {
            heatTime += (heatTime * 20 / 100);  
        } else if (!foodItems.equalsIgnoreCase("Vegetables")) {
            System.err.println("Invalid Food Item");
            return -1;  
        }

      
        if (microwaveModel.equalsIgnoreCase("Medium")) {
            heatTime -= (heatTime * 10 / 100); 
        } else if (microwaveModel.equalsIgnoreCase("Low")) {
            heatTime += (heatTime * 15 / 100);  
        } else if (!microwaveModel.equalsIgnoreCase("High")) {
            System.out.println("Invalid Microwave Model");
            return -1; 
        }

        return heatTime;
    }

    static void inputAndCalculate() {
        Scanner in = new Scanner(System.in);

       
        System.out.println("Enter the number of items (1-3):");
        int numOfItems = in.nextInt();
        if (numOfItems < 1 || numOfItems > 3) {
            System.err.println("Invalid number of items!");
            return;  
        }

        System.out.println("Enter the heating time for one item (in seconds):");
        int heatTime = in.nextInt();
        if (heatTime <= 0) {
            System.err.println("Heating time should be positive!");
            return;
        }

        System.out.println("Enter the type of food (pasta, frozen meal, vegetables):");
        String foodItems = in.next();

        System.out.println("Enter the microwave model (high, medium, low):");
        String microwaveModel = in.next();

       
        double finalHeatTime = calculateHeatingTime(numOfItems, heatTime, foodItems, microwaveModel);

        if (finalHeatTime != -1) {
            System.out.println("The recommended heating time is: " + (int) finalHeatTime + " seconds.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            inputAndCalculate();  
            System.out.println("\nDo you want to calculate for another user? (yes/no):");
            Scanner in = new Scanner(System.in);
            String response = in.next();
            if (response.equalsIgnoreCase("no")) {
                break;  
            }
        }
    }
}
