package com.javaExceptionHandling;

import java.io.IOException;

class ThrowsPropogatingCheckedException {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ThrowsPropogatingCheckedException obj = new ThrowsPropogatingCheckedException();
		obj.p();
		System.out.println("normal flow...");
	}
}

/*
 * Which exception should be declared? Ans: Checked exception only, because:
 * 
 * unchecked exception: under our control so we can correct our code.
 * error:beyond our control. For example, we are unable to do anything if there occurs
 * VirtualMachineError or StackOverflowError.
 *  Advantage of Java throws keyword
Now Checked Exception can be propagated (forwarded in call stack).
It provides information to the caller of the method about the exception.
 */