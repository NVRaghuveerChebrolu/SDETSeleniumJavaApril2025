package com.javaExceptionHandling;

public class ThrowAndThrows {
	// defining a user-defined method
	// which throws ArithmeticException
	static void method1() throws ArithmeticException {
		System.out.println("Inside the method1()");
		throw new ArithmeticException("throwing ArithmeticException");
	}
	
	static {
		System.out.println("inside static block");
	}

	// main method
	public static void main(String args[]) {
		try {
			method1();
		} catch (ArithmeticException e) {
		//	e.printStackTrace();
			System.out.println("caught in main() method");
		}
	}
}