package com.celcom.day6;

public class TryCatchExample2 {
	public static void main(String[] args) {
		System.out.println("Before Exception");

		try {
			int a = Integer.parseInt("ABC");
		} catch (ArithmeticException e) {

			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (NegativeArraySizeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Block");
		}

		System.out.println("After Exception");
	}
}
