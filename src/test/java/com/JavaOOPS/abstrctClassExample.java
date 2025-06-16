package com.JavaOOPS;

/*Abstraction is a process of hiding the implementation details and 
showing only functionality to the user.*/

/*Ways to achieve Abstraction
There are two ways to achieve abstraction in java

Abstract class (0 to 100%)
Interface (100%)*/
abstract class Bank12345 {
	int a,b;
	abstract int getRateOfInterest();
	
	 int sum(int a , int b){
		System.out.println(a+b);
		return a+b;
	}
}

 class SBI extends Bank12345 {

	int getRateOfInterest() {
		return 6;
	}

}

class PNB extends SBI {
	int getRateOfInterest() {
		return 8;
	}
}

public class abstrctClassExample {
	public static void main(String args[]) {
		Bank12345 b=// new Bank12345(); //cannot instantiate abstract class
		b = new SBI();//upcasting
		System.out.println("Rate of Interest of SBI is: " + b.getRateOfInterest() + " %");
		b = new PNB();
		System.out.println("Rate of Interest of PNB is: " + b.getRateOfInterest() + " %");
		b.sum(3, 9);
	}
}