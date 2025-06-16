package com.JavaOOPS;

class Bike321 {
	void run() {
		System.out.println("running");
	}
}

class RunTimePolymorphism extends Bike321 {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Bike321 b = new RunTimePolymorphism();// upcasting
		b.run();
		Bike321 b1 = new Bike321();
		b1.run();
		RunTimePolymorphism obj = new RunTimePolymorphism();
		obj.run();
	//	RunTimePolymorphism obj2 = new Bike321();// This is not possible
	//	obj2.run();
	}
}