package com.javaExceptionHandling;

import java.io.IOException;

class ExceptionPropogationInCheckedException {
	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropogationInCheckedException obj = new ExceptionPropogationInCheckedException();
		obj.p();
		System.out.println("normal flow");
	}
}

//Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).