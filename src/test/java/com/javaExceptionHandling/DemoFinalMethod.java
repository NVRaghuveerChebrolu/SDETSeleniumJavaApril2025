package com.javaExceptionHandling;

class ABC12321 {
//note : we cannot override the finam method
	 final void sum(int a, int b) {
		System.out.println(a + b);
	}
}

public class DemoFinalMethod extends ABC12321 {

//	void sum(int a, int b) {
//		System.out.println(a - b);
//	}

	public static void main(String[] args) {
		DemoFinalMethod obj = new DemoFinalMethod();
		obj.sum(9, 3);
	}

}
