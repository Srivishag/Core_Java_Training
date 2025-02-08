package com.celcom.week1Assignment;

import java.util.Scanner;

class Circle {
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	void area() {
		double area=Math.PI*radius*radius;
		System.out.format("Area of the Circle : %.2f \n" ,area);
	}
	void circumference() {
		double circumference=2*Math.PI*radius;
		System.out.format("Circumference of the Circle : %.2f \n ", circumference);
	}
}
public class Assignment4{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		double radius=in.nextDouble();
		Circle shape=new Circle(radius);
		shape.area();
		shape.circumference();
		in.close();
		
	}
}
