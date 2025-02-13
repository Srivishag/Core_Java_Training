package com.celcom.day7;

interface MyInterface {
	void display();
}

public class InnerClassExample {

	// Inner Class
	class InnerClass {
		void myMethod1() {
			System.out.println("Non static inner class");
		}

	}

	static class InnerClassStatic {
		void myMethod2() {
			System.out.println("Static inner class");
		}
	}

	void myMethod() {
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}
		InnerClass3 inner3 = new InnerClass3();
		inner3.myMethod3();
	}

	public static void main(String[] args) {
		InnerClassExample obj = new InnerClassExample();
		InnerClass inner1 = obj.new InnerClass();
		inner1.myMethod1();
		InnerClassExample.InnerClassStatic inner2 = new InnerClassExample.InnerClassStatic();
		inner2.myMethod2();

		MyInterface obj1 = new MyInterface() {
			public void display() {
				System.out.println("Anonymous Innerclass");
			}
		};

		obj1.display();

		// Lambda Expression

		MyInterface obj2 = () -> System.out.println("Lambda Expression");
		obj2.display();
	}
}
