package com.oopsBasics;

class abc{
	//we cannot override a final method
	final int Caculation(int a, int b) {
		return a+b;
	}
}

public class finalMethod extends abc {
	//overriding in java : come under run time polymorphism

//	int Caculation(int a, int b) {
//		return a * b;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalMethod obj = new finalMethod();
		System.out.println(obj.Caculation(4, 16));
	}

}
