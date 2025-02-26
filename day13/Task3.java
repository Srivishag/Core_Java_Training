package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task3 {
	public static void main(String[] args) {
		Runnable task=()->{
			try {
				System.out.println("Thread Called "+Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("Task Completed "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++)
			executor.submit(task);
		executor.shutdown();
		
	}
}
