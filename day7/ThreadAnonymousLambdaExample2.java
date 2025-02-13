package com.celcom.day7;

public class ThreadAnonymousLambdaExample2 {
	public static void main(String[] args) {
		//Using Anonymous Inner Class
				Runnable runnable1 = new Runnable() {
					public void run() {
						for(int i=1;i<=10;i++) {
							System.err.println("5 * "+i+" = "+(i*5));
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
					for(int i=1;i<=10;i++) {
						System.out.println("2 * "+i+" = "+(i*2));
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
