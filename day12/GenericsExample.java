package com.celcom.day12;

class GenericDemo <T>{
	private T value;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value=value;
	}
	
}

public class GenericsExample {
	public static void main(String[] args) {
		GenericDemo<Integer> gen=new GenericDemo<>();
		gen.setValue(10);
		System.out.println(gen.getValue());
		
		GenericDemo<String> gen1=new GenericDemo<>();
		gen1.setValue("kumar");
		System.out.println(gen1.getValue());
	}
	
	
}
