package com.JavaOOPS;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static int add(int a) {
		return a ;
	}
}

public class overloadingWithDifferentArguments {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 13));
		System.out.println(Adder.add(11, 138, 14));
		System.out.println(Adder.add(15));
	}
}