package com.Java;

public class JavaBasics {
	int a =9;//instance variable : defined inside a class and outside a method
	static int b =4;// static variable 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c =2; //local variable : declared inside a method
		JavaBasics obj = new JavaBasics();
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(c);
	}

}
