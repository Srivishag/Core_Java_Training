package com.celcom.day7;

public class ThreadAnonymousLambdaExample1 {
	public static void main(String[] args) {
		
		//Using Anonymous Inner Class
		Runnable runnable1 = new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.err.println("Thread t1 is running "+i+" times");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t1 = new Thread(runnable1);
		t1.setPriority(1);
		t1.start();
		
		//Using Lambda Expression
		
		Runnable runnable2 =()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Thread t2 is running "+i+" times");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2=new Thread(runnable2);
		t2.setPriority(10);
		t2.start();
		
	}
}
