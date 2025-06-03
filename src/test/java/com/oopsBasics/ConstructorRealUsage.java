package com.oopsBasics;

class Student432 {
	int rollno;
	String name, course;
	float fee;
	int year;

	Student432(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student432(int rollno, String name, String course, float fee) {
		//Constructor call must be the first statement in a constructor
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
		
	}
	
	Student432(int rollno, String name, String course, float fee,int year) {
		//Constructor call must be the first statement in a constructor
		this(rollno, name, course,fee);// reusing constructor
		this.year=year;
		
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee+" "+year);
	}
}

class ConstructorRealUsage {
	public static void main(String args[]) {
		Student432 s3 = new Student432(112, "sumit", "java", 6000f,2019);
		Student432 s1 = new Student432(111, "ankit", "java");
		Student432 s2 = new Student432(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
		s3.display();
	}
}