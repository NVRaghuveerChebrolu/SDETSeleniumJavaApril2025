package com.ControlStatements;

public class switchStatementExample {
	public static void main(String[] args) {
		char ch = 'j';
		int count =6;
		switch (ch) {
		case 'a':
			System.out.println("Vowel a");
			break;
		case 'e':
			System.out.println("Vowel e");
			break;
		case 'i':
			System.out.println("Vowel i");
			break;
		case 'o':
			System.out.println("Vowel o");
			break;
		case 'u':
			System.out.println("Vowel u");
			break;
		case 'A':
			System.out.println("Vowel A");
			break;
		case 'E':
			System.out.println("Vowel E");
			break;
		case 'I':
			System.out.println("Vowel I");
			break;
		case 'O':
			System.out.println("Vowel O");
			break;
		case 'U':
			System.out.println("Vowel U");
			break;
		default:
			System.out.println("give only vowel");
		}
		switch (count) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			//break;
		case 7:
			System.out.println("7");
			//break;
		case 8:
			System.out.println("8");
			//break;
		case 9:
			System.out.println("9");
			break;
		case 10:
			System.out.println("10");
			break;
		default:
			System.out.println("default");
		}
	}
}