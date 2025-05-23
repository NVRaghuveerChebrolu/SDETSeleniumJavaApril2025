package com.AccessModifiers;

public class accessModifier_Public {
	/*Note:
	The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.*/
	
	public int b = 9;
	
	public void msg12345() {
		System.out.println("Hello inside public class and public method");
	}
	
	public static void msg123456() {
		System.out.println("Hello inside public class and public static method");
	}
	
	public static void main(String[] args) {
		accessModifier_Public obj = new accessModifier_Public();
		System.out.println(obj.b);
		obj.msg12345();
		msg123456();
		
	}

}
