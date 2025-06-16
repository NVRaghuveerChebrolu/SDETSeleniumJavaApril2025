package com.JavaOOPS;

//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank {
	int getRateOfInterest() {
		return 2;
	}
}

// Creating child classes.
class SBI23451 extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	/*
	 * int getRateOfInterest() { return 7; }
	 */
}

class AXIS extends Bank {	
	int getRateOfInterest() {
		return 9;
	}
}

// Test class to create objects and call the methods
public class overRidingRealTimeExample {
	public static void main(String args[]) {
		SBI23451 s = new SBI23451();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
	}
}