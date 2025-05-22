package com.ControlStatements;

public class nestedFor {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {//outer for loop
			for (int j = 1; j <= i; j++) { //inner for loop
				System.out.print("* ");
			}
			System.out.println();// new line
		}
	}
}
