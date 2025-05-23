package com.AccessModifier2;

import com.AccessModifiers.accessModifier_Public;

public class accessModifier_AccessingPublic {
	public static void main(String args[]) {
		accessModifier_Public obj = new accessModifier_Public();
		obj.msg12345();
		System.out.println(obj.b);
		accessModifier_Public.msg123456();
	}
}