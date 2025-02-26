package com.celcom.day13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

class NumberPrinter implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		return sum;
	}
	
}

public class Task5 {
	public static void main(String[] args) {
		NumberPrinter obj = new NumberPrinter();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Integer> result=executor.submit(obj);
		try {
			System.out.println("The sum of twenty natural number is : "+result.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		executor.shutdown();
	}
}
