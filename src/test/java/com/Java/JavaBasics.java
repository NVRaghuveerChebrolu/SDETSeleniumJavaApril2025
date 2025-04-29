package com.Java;

public class JavaBasics {
	int a =9;//instance variable : defined inside a class and outside a method
	static int b =4;// static variable 
	
	public void display() {
		int x=6;//local variable : declared inside a method
		System.out.println(x);
	}
	
	public static void sum(int i,int j) {
		System.out.println(i+j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c =2; //local variable : declared inside a method
		JavaBasics obj = new JavaBasics();
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(c);
		sum(7,8);
		obj.display();
	}

}
