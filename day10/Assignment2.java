package com.celcom.day10;

import java.util.Scanner;

class Resource{
	private String product;
	static Scanner in = new Scanner(System.in);
	void setProduct() {
		System.out.println("\nEnter product Information");
		product=in.nextLine();
		System.out.println("Product Information is saved");
	}
	
	void getProduct() {
		System.out.println("\nThe Product Information is :" + product);
	}
}

class Producer extends Thread{
	Resource resource;
	Producer(Resource resource){
		this.resource=resource;
	}
	public void run() {
		synchronized(resource) {
			System.out.println("\nProducer is Called");
			resource.notify();
			resource.setProduct();
		}
	}
	
	}


class Consumer extends Thread{
	Resource resource;
	
	Consumer(Resource resource){
		this.resource=resource;
	}
	public void run() {
		synchronized(resource) {
			System.out.println("\nConsumer is Asked to waiy till producer completed the product");
			try {
				resource.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.getProduct();
		}
	}
	
}

public class Assignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		Resource resource = new Resource();
		Consumer consumer = new Consumer(resource);
		Producer producer = new Producer(resource);
		consumer.start();
		producer.start();

	}
}
