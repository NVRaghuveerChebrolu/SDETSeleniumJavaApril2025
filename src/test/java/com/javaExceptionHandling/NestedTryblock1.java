package com.javaExceptionHandling;

public class NestedTryblock1 {
	public static void main(String args[]) {
		// outer try block
		try {
			// inner try block 1
			try {
				System.out.println("going to divide by 0");
				int b = 39 / 0;
			}
			// catch block of inner try block 1
			catch (ArithmeticException e) {
				System.out.println(e);
			}

			// inner try block 2
			try {
				int a[] = new int[5];

				// assigning the value out of array bounds
				a[5] = 4;//going to throw array index out of bound exception
			}

			// catch block of inner try block 2
			catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println(e);
			}

			System.out.println("other statement");
		}
		// catch block of outer try block
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("handled the exception (outer catch)");
		}

		System.out.println("normal flow..");
	}
}