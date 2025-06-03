package com.oopsBasics;

class A21 {
	A21() {
		this(5);
		System.out.println("hello a");
	}

	A21(int x) {
		System.out.println(x);
	}
}

class ThisParameterizedConstructor {
	public static void main(String args[]) {
		A21 a = new A21();
	}
}