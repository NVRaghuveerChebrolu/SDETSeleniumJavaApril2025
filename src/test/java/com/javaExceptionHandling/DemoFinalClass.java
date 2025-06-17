package com.javaExceptionHandling;

//Note : Class declared as final cannot be extended

 final class boat {
	int a = 10;

	void mul(int a, int b) {
		System.out.println(a * b);
	}
}

//
//public class DemoFinalClass extends boat {
//
//	public static void main(String[] args) {
//		DemoFinalClass obj = new DemoFinalClass();
//		System.out.println(obj.a);
//		obj.mul(4, 9);
//	}
//}
