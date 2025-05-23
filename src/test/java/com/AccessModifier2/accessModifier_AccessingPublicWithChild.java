package com.AccessModifier2;

import com.AccessModifiers.accessModifier_Public;

public class accessModifier_AccessingPublicWithChild extends accessModifier_Public{
	public static void main(String args[]) {
		accessModifier_AccessingPublicWithChild obj = new accessModifier_AccessingPublicWithChild();
		obj.msg12345();
		System.out.println(obj.b);
		accessModifier_Public.msg123456();
	}
}