package com.celcom.day7;

class MyThread extends Thread {
	int num;

	public MyThread(int num) {
		this.num = num;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("My Thread is Running ..." + Thread.currentThread());
			try {
				Thread.sleep(num);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread(1000);
		MyThread t2 = new MyThread(1000);
		MyThread t3 = new MyThread(1000);

		// using Thread Class Methods
		System.out.println(t1.getState());
		System.out.println(t1.getName());
		t1.setName("Thread 1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());

		t1.setPriority(10);
		t2.setPriority(9);
		t3.setPriority(8);

		// Experimenting with Threads
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(1000);
		System.out.println("MAIN_END");
	}
}
