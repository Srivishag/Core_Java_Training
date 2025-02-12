package com.celcom.day7;

class MyThread2 implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " Running....");
			try {
				Thread.sleep(200);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread2());
		t1.setName("t1");

		Thread t2 = new Thread(new MyThread2());
		t2.setName("t2");

		t1.start();
		t2.start();
	}
}
