package com.JavaOOPS;

//Example of an abstract class that has abstract and non-abstract methods and also constructor and static methods
//Rule: If there is an abstract method in a class, that class must be abstract, other wise compile time error will occur
//Abstract class can have constructor , static and final methods, if any method is declared , that method should be declared with abstract keyword.
 abstract class Bike245 {
	Bike245() {
		System.out.println("bike is created");
	}
	public String name="learning java";	
	abstract void run();
	static int sum(int a , int b) {
		return a+b;
	}
	
	 abstract int add(int a,int b, int c);

	 final void changeGear() {
		System.out.println("gear changed");
	}
}

// Creating a Child class which inherits Abstract class
class Honda extends Bike245 {
	void run() {
		System.out.println("running safely..");
	}
	
	int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}
//	void changeGear(){
//		System.out.println("gear changed in child class");
//	}
	
}

// Creating a Test class which calls abstract and non-abstract methods
public class abstractClassMethodConstructor {
	public static void main(String args[]) {
		//Bike245 obj1 = new Bike();//cannot instantiate the abstract class
		Bike245 obj = new Honda(); //upcasting
		obj.run();
		obj.changeGear();
		System.out.println(Bike245.sum(7, 9));
		System.out.println(obj.add(3, 4, 5));
	}
}
