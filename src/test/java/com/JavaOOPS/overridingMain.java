package com.JavaOOPS;

class A985 {
	public static void main(String[] args) {
		System.out.println("This is the main method of the superclass");
	}
}

class B353 extends A985 {
	public static void main(String[] args) {
		System.out.println("This is the main method of the subclass");
	}
}

public class overridingMain {
	public static void main(String args[]) {
		//B353 obj12 = new B353();
		//main(args);
		A985.main(args);
		B353.main(args);
	}
}