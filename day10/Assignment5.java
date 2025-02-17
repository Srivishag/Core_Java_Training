package com.celcom.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		 System.out.println("Enter the Size of the array 1");
	        int array1Length=in.nextInt();
	        for(int i=0;i<array1Length;i++) {
	        	System.out.print("Element "+i+" :");
	        	int num=in.nextInt();
	        	boolean flag=true;
	        	
	        	for(int j=0;j<array1.size();j++) {
	        		if(array1.get(j)>=num) {
	        			array1.add(j,num);
	        			flag=false;
	        			break;
	        		}
	        	}
	        	if(flag) {
	        		array1.add(num);
	        	}
	        }
	        
	        System.out.println("The Sorted Array ");
	        
	        for(int i=0;i<array1.size();i++) {
	        	System.out.println("Element "+i+" :"+array1.get(i));
	        	
	        }
	        
	     in.close();

	}
}
