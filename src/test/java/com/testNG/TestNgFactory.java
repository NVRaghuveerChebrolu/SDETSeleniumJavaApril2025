package com.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestNgFactory {
	private String user = "";
	private String pwd = "";
	
	public TestNgFactory(String user,String pwd) {
		this.user = user;
		this.pwd = pwd;
	}
	
	

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before beforeClass executed.");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod executed.");
	}

	@Test
	public void testMethod1() {
		System.out.println("testMethod1 parameter value is: " + user);
		System.out.println("testMethod1 parameter value is: " + pwd);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMetho2 is not accepting parameters");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("testMethod3 parameter value is: " + user);
		System.out.println("testMethod3 parameter value is: " + pwd);
	}

	@Factory
	public static Object[] Raghu() {
		return new Object[] { 
				new TestNgFactory("user1","pwd1"),
				//new TestNgFactory("hi"),
				new TestNgFactory("user2","pwd2")
//				new TestNgFactory("raghuveer"),
//				new TestNgFactory("selenium") 
				};
	}
}
