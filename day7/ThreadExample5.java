package com.celcom.day7;

class TwoTable extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * 2 = " + (i * 2));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}
}

class FiveTable implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.err.println(i + " * 5 = " + (i * 5));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class ThreadExample5 {
	public static void main(String[] args) throws InterruptedException {
		TwoTable two = new TwoTable();
		Thread five = new Thread(new FiveTable());
		two.start();
		two.join();
		System.out.println("Main First");
		five.start();
		five.join();
		System.out.println("Main Last");

	}
}
