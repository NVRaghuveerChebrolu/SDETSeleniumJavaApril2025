package com.oopsBasics;

class ThisPassedAsArgumentInMethod {
	void m(ThisPassedAsArgumentInMethod obj) {
		System.out.println("method is invoked");
	}

	void p() {
		m(this);
	}

	public static void main(String args[]) {
		ThisPassedAsArgumentInMethod s1 = new ThisPassedAsArgumentInMethod();
		s1.p();
	}
}