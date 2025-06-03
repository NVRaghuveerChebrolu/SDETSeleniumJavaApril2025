package com.oopsBasics;

// Java Program to demonstrate the use of an instance variable
// which get memory each time when we create an object of the class.
class ConterWithAndWithOutStatic {
	 //int count = 6;// will get memory each time when the instance is created
	 int count = 6;// will get memory only once and retain its value
	static int abc = 1;

	ConterWithAndWithOutStatic() {
		count++;// incrementing value
		System.out.println(count);
	}

	void display() {
		for (int i = 0; i <= 10; i++) {
			abc++;
		}
		System.out.println(abc);
	}

	public static void main(String args[]) {
		// Creating objects
		ConterWithAndWithOutStatic c12 = new ConterWithAndWithOutStatic();
		ConterWithAndWithOutStatic c22 = new ConterWithAndWithOutStatic();
		ConterWithAndWithOutStatic c32 = new ConterWithAndWithOutStatic();
		c12.display();
		c22.display();
		c32.display();
	}
}