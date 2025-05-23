package com.AccessModifiers;

public class accessModifier_Protected {
	/*Note:
	The protected access modifier is accessible within package and outside the package but through inheritance only.
	The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
	It provides more accessibility than the default modifer*/
	protected int a=8;
	protected static void msg123() {
		System.out.println("Hello i am in protected");
	}
	
	protected accessModifier_Protected(){
		System.out.println("inside constructor of parent class");
	}
	
	public static void main(String[] args) {
		accessModifier_Protected obj = new accessModifier_Protected();
		System.out.println(obj.a);
		msg123();
	}
}
