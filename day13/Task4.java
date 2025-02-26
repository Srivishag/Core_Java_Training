package com.celcom.day13;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class CurrentTime implements Runnable{

	@Override
	public void run() {
		System.out.println("Time : "+LocalTime.now());
	}
	
}

public class Task4 {
	public static void main(String[] args) {
		CurrentTime time = new CurrentTime();
		ScheduledExecutorService executor=Executors.newScheduledThreadPool(5);
		executor.scheduleAtFixedRate(time,0, (long) 1.5, TimeUnit.SECONDS);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdown();
	}
}
