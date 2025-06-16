package com.JavaOOPS;

class overLoadingWithTypeArgumentsAmbiguity {

	void sum(long a, double b) {
		System.out.println("a method invoked");
		System.out.println(a + b);
	}

	
	void sum(float a, long b) {
		System.out.println("b method invoked");
	}

	void sum(float a, double b, long c) {
		System.out.println("b method invoked");
		System.out.println(a+b+c);
	}

	public static void main(String args[]) {
		overLoadingWithTypeArgumentsAmbiguity obj = new overLoadingWithTypeArgumentsAmbiguity();
		//obj.sum(20, 26);// now ambiguity because int type is promoted to long which is used in both sum
						// methods
		 obj.sum('c', 'f','h');
	}
}

//Note : One type is not de-promoted implicitly for example 
//double cannot be depromoted to any type implicitly.