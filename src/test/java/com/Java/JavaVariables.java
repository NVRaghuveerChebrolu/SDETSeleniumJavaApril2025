package com.Java;

public class JavaVariables {
	//instance variables : declared inside the class , but outside the method
	String employeeName ="Rahul";
	int employeeNumber = 34526;
	char ch ='s';
	
	//static variables : declared with help of static keyword
	//memory will be allocated first to the static variables
	static int xyz =987;
	
	//local variables : declared inside a method
	// x and y are local variables
	public int salary(int x, int y) {
		System.out.println("X value is:"+x + " Y value is:"+y);
		return x*y;
	}
	
	public static void display() {
		System.out.println("I am inside display method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xyz);
		JavaVariables obj = new JavaVariables();
		System.out.println(obj.employeeNumber);
		//display();
		obj.salary(4,5);
		System.out.println(obj.salary(6,8));
	}

}
