package com.javaExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {

		try {
			//int a[] = new int[5];
			int a[] = {5,2,7,16,83,93};
			//int abc = 19/0;
			//int abc = a[7];
			String str = null;
			System.out.println(str.length());
		} 
		catch (ArithmeticException e){
			System.out.println("Arithmetic Exception occurs");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
			e.printStackTrace();
			
		}
		System.out.println("rest of the code");
	}
}
