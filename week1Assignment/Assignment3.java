package com.celcom.week1Assignment;

import java.util.Scanner;

 class Rectangle {
	double width;
	double height;
	
	Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	
	void area() {
		double area=width*height;
		System.out.format("Area of the Rectangle : %.2f \n" , area);
	}
	
	void perimeter() {
		double perimeter=2*(height+width);
		System.out.format("Perimeter of the Rectangle : %.2f", perimeter);
	}
}
public class Assignment3{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Width of the Rectangle");
		double width=in.nextDouble();
		System.out.println("Enter the Height of the Rectangle");
		double height=in.nextDouble();
		Rectangle shape=new Rectangle(width,height);
		shape.area();
		shape.perimeter();
		in.close();
	}
}
