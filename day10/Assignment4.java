package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment4 {
    public static boolean areArraysEqual(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr1.size() != arr2.size()) return false; 

        Collections.sort(arr1);
        Collections.sort(arr2);

        return arr1.equals(arr2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of the array 1");
        int array1Length=in.nextInt();
        for(int i=0;i<array1Length;i++) {
        	System.out.print("Element "+i+" :");
        	array1.add(in.nextInt());
        }
        
        System.out.println("Enter the Size of the array ");
        int array2Length=in.nextInt();
        for(int i=0;i<array2Length;i++) {
        	System.out.print("Element "+i+" :");
        	array2.add(in.nextInt());
        }
        
        if (areArraysEqual(array1, array2)) {
            System.out.println("Both arrays contain the same elements.");
        } else {
            System.out.println("Arrays do not contain the same elements.");
        }
        in.close();
    }
}

