package com.celcom.day7;

class MyThread1 implements Runnable {
	int num;

	public MyThread1(int num) {
		this.num = num;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("My Thread is Running ...");
			try {
				Thread.sleep(num);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample3 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread1(100));

		// using Thread Class Methods
		System.out.println(t1.getState());
		System.out.println(t1.getName());
		t1.setName("Thread 1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());

		t1.setPriority(10);

		// Experimenting with Threads
		//t1.suspend(); // does not work for newer version of java

		t1.start();

		//t1.resume(); // does not work for newer version of java
		Thread.sleep(1000);
		System.out.println("MAIN_END");

	}

}
