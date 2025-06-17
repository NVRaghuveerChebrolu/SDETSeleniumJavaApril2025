package com.javaExceptionHandling;

public class ExceptionExample {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			int data = 100 / 0;
			System.out.println(data);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("clean up code for releasing the occupied memory");
			
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}