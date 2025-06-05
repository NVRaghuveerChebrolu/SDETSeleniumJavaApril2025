package com.JavaOOPS;

interface Printable {
	void print();
}

interface Showable {
	void show();
	void print();
}

class multipleInheritanceInterface implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		multipleInheritanceInterface obj = new multipleInheritanceInterface();
		obj.print();
		obj.show();
	}
}