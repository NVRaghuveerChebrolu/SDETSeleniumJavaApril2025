package com.javaExceptionHandling;

public class Throw1 {
	// function to check if person is eligible to vote or not
	public static void validate(int age) {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	// main method
	public static void main(String args[]) {
		// calling the function
		validate(42);
		System.out.println("rest of the code...");
	}
}

/*
 * Example 1: Throwing Unchecked Exception In this example, we have created a
 * method named validate() that accepts an integer as a parameter. If the age is
 * less than 18, we are throwing the ArithmeticException otherwise print a
 * message welcome to vote.
 */