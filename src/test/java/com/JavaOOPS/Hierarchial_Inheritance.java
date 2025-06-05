package com.JavaOOPS;

class Animal123 {
	 int a = 5;

	void eat113() {
		System.out.println("eating...");
	}
}

class Dog456 extends Animal123 {
	void bark887() {
		System.out.println("barking...");
	}
}

public class Hierarchial_Inheritance extends Animal123 {
	void meow() {
		System.out.println("meowing...");
	}

//	void eat113() {
//		System.out.println("hi overriding eat113");
//	}

	public static void main(String args[]) {
		Hierarchial_Inheritance c = new Hierarchial_Inheritance();
		c.meow();
		c.eat113();
		System.out.println(c.a);
		//c.bark887();//Compile Time Error
		Dog456 obj = new Dog456();
		obj.bark887();
		obj.eat113();
		obj.a = 6;
		System.out.println(obj.a);
	}
}