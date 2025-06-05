package com.JavaOOPS;

class Animal9875 {
	 int a =9;
	 void eat() {
		System.out.println("eating...");
	}
}

class Dog2765 extends Animal9875 {
	void bark() {
		System.out.println("barking...");
	}
//over-riding in java
	
//	void eat() {
//		System.out.println("eating in my own way...");
//	}

}
class SingleInheritance {
	public static void main(String args[]) {
		Dog2765 d = new Dog2765();
		d.bark();
		d.eat();
		System.out.println(d.a);
	}
}