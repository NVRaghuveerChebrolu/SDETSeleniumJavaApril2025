package com.Java;

public class FirstProgram {
	int arr[]= {3,5,7,8};
	
	public int sum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to java world");
		FirstProgram obj = new FirstProgram();
		System.out.println(obj.sum(3, 5));
	}

}
