package com.oopsBasics;

//overloading is possible with final key word
//Overriding is not possible when method is declared as final
class Bike {
	  final void run() {
		System.out.println("running");
	}
	final void run(int a, int b){
		System.out.println("a:"+a +"b:"+b);
	}
}

class finalMethodOverloading extends Bike {

//	void run() {
//		System.out.println("running safely with 100kmph");
//	}

	public static void main(String args[]) {
		finalMethodOverloading honda = new finalMethodOverloading();
		honda.run();
		honda.run(5,3);
	}
}

