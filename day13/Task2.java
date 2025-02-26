package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(6);
		for(int i=0;i<10;i++) {
			executor.submit(()->{
				//i++; Why error
				System.out.println("Current Thread : "+Thread.currentThread().getName());
			});
		}
		
	}
}
