package com.celcom.week1Assignment;

class Shape{
	void getArea() {}
}

class Rectangles extends Shape{
	int height;
	int width;
	Rectangles(int height,int width){
		this.height=height;
		this.width=width;
	}
	void getArea() {
		System.out.println("Area of Rectangle :"+height*width);
	}
}
public class Assignment10 {
	public static void main(String[] args) {
		Shape rectangle=new Rectangles(10,20);
		rectangle.getArea();
	}
}
