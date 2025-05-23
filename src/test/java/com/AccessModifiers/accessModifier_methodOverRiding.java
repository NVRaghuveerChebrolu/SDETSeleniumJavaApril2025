package com.AccessModifiers;

class simple123 {
	protected void msg() {
		/*Note:
		If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive
		The default modifier is more restrictive than protected. That is why, there is a compile-time error.*/	
		System.out.println("Hello java");
	}

}

public class accessModifier_methodOverRiding extends simple123 {
//	void msg() {
//		System.out.println("Hello java new definition");
//	}// C.T.Error

	public static void main(String args[]) {
		accessModifier_methodOverRiding obj = new accessModifier_methodOverRiding();
		obj.msg();
	}
}