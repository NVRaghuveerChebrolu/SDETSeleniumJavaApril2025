package com.JavaOOPS;

// Java Program to illustrate the use of Java Method Overriding
// Creating a parent class.
class Vehicle {
	// defining a method
	void run(int a, int b) {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class overRiding extends Vehicle {
	// defining the same method as in the parent class

	void run(int a, int b) {
		System.out.println("Bike is running safely");
	}

	public static void main(String args[]) {
		overRiding obj = new overRiding();// creating object
		obj.run(4,9);// calling method
		Vehicle obj1 = new Vehicle();
		obj1.run(2,8);
		Vehicle obj2 = new overRiding();//upcasting
		obj2.run(2,8);
		//overRiding obj3 = new vehicle();
		//obj3.run(4,9);
	}
}

/*Method Overriding in Java :
	If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

	In other words, If a subclass provides the specific implementation of the method that has been declared 
	by one of its parent class, it is known as method overriding.
	
	Usage of Java Method Overriding :
	Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
	Method overriding is used for runtime polymorphism
	Rules for Java Method Overriding
	1.The method must have the same name as in the parent class
	2.The method must have the same parameter as in the parent class.
	3.There must be an IS-A relationship (inheritance).*/