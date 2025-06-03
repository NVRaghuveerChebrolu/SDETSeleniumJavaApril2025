package com.oopsBasics;

public class BikeContsructor {
	int id;
	String s;
	//constructor :
	//1. Method which is having same name as the class name
	//2. constructor will not have any return type
	//3. there are 2 types of constructors . please see below
	
	//constructor without arguments called as "no argument constructor" or default constructor
	 BikeContsructor() {
		System.out.println("constructor is created/invoked");
		
	}

	 //constructor with arguments or parameters is called parameterized
	 BikeContsructor(int a, String b) {
		{
			id = a;
			s = b;
			System.out.println("parameter constructor is created/invoked");
			System.out.println(a + b);
		}
	}

	void display() {
		System.out.println(id + " " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeContsructor b1 = new BikeContsructor();
		BikeContsructor b2 = new BikeContsructor(5, "Arun");
		BikeContsructor b3 = new BikeContsructor(99, "hello");
		b1.display();
		b2.display();
		b3.display();

	}

}
