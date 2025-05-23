package com.AccessModifiers;

class A123 {
	private A123() {
	}// private constructor

	void msg() {
		System.out.println("Hello java");
	}
}

public class accessModifier_PrivateConstructor {
	public static void main(String args[]) {
	//note :Note: A class cannot be private or protected except nested class.
	//If you make any class constructor private, you cannot create the instance of that class from outside the class. For example:
	//	A123 obj = new A123();// Compile Time Error
	}
}