package com.JavaOOPS;

class encapsulationExampleTest {
	public static void main(String[] args) {
		// creating instance of the encapsulated class
		encapsulationExample s = new encapsulationExample();
		// setting value in the name member
		s.setName("vijay");
		// getting value of the name member
		System.out.println(s.getName());
		s.setName("rakesh");
		// getting value of the name member
		System.out.println(s.getName());
		//s.name;
	}
}
