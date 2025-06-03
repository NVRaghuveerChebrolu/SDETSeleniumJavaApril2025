package com.oopsBasics;

class Student_64 {
	int rollno;
	String name;
	float fee;

	Student_64(int rollno, String name, float fee) {
		/*rollno = rollno;
		name = name;
		fee = fee;*/
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class ThisKeyword {
	public static void main(String args[]) {
		Student_64 s1 = new Student_64(111, "ankit", 5000f);
		Student_64 s2 = new Student_64(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}