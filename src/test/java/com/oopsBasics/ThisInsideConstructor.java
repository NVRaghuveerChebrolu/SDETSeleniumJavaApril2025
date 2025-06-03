package com.oopsBasics;

class B {
	ThisInsideConstructor obj;
	B(ThisInsideConstructor obj) {
		this.obj = obj;
	}
	void display() {
		System.out.println(obj.data);// using data member of
										// ThisInsideConstructor class
	}
}

class ThisInsideConstructor {
	int data = 10;
	ThisInsideConstructor() {
		B b = new B(this);
		b.display();
	}
	public static void main(String args[]) {
		ThisInsideConstructor a = new ThisInsideConstructor();
	}
}