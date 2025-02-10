package com.celcom.day5;

import java.util.Scanner;

interface Perimeter{
	void calculatePerimeter();
}
interface Area{
	void calculateArea();
}

abstract class Shape implements Area,Perimeter{
	int length;
	float height;
	int breadth;
	int radius;
	
	static double half=0.5;
	public Shape(int radius) {
		this.radius=radius;
	}
	public Shape(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public Shape(int length,float height) {
		this.length=length;
		this.height=height;
	}
	
}
 class Circle extends Shape{
	
	public Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		System.out.println("Area of Circle : "+Math.PI*radius*radius);
	}

	
	public void calculatePerimeter() {
		System.out.println("Circumference of Circle : "+2*Math.PI*radius);
	}
	
}
class Rectangle extends Shape{
	
	
	public Rectangle(int length,int breadth) {
		super(length,breadth);
	}

	public void calculateArea() {
		System.out.println("Area of Rectangle : "+length*breadth);
	}

	public void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle : "+ 2*(length+breadth));
	}
	
}
class Triangle extends Shape{
	public Triangle(int length,float height){
		super(length,height);
	}
	public void calculateArea() {
		System.out.println("Area of Triangle : "+half*length*height);

		
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of Triangle :"+(length+length+height));	
	}
	
}
public class InterfaceExample3 {
	public static void main(String[] args) {
		Shape shape;
		Scanner in=new Scanner(System.in);
		while(true) {
		System.out.println("Choose a Shape Number: \n 1.Circle \n 2.Rectangle \n 3.Triangle \n 4.Quit");
		int choice=in.nextInt();
		if(choice==1) {
			System.out.println("Enter the Radius");
			int radius=in.nextInt();
			shape=new Circle(radius);
			shape.calculateArea();
			shape.calculatePerimeter();

		}
		else if(choice==2) {
			System.out.println("Enter the Length");
			int length=in.nextInt();
			System.out.println("Enter the Breadth");
			int breadth=in.nextInt();
			shape=new Rectangle(length,breadth);
			shape.calculateArea();
			shape.calculatePerimeter();
			
		}
		else if(choice==3) {
			System.out.println("Enter the Length");
			int length=in.nextInt();
			System.out.println("Enter the Height");
			float height=in.nextFloat();
			shape=new Triangle(length,height);
			shape.calculateArea();
			shape.calculatePerimeter();
			
		}
		else {
			System.out.println("Thank You");
			break;
		}
		System.out.println();
	}
		in.close();
		
	}
	
}



