package com.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Annotations {
	
	@Test(priority=1,dependsOnMethods = {"loginTestCase"})
	public void testCase2() {
		System.out.println("testcase2");
	}
	
	@Test(priority=2)
	public void testCase1() {
		System.out.println("testcase1");
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=-5)
	public void loginTestCase() {
		System.out.println("loginTestCase");
		Assert.assertEquals(false, true);
	}
	
	@Test(invocationCount=6)
	public void Testcase4() {
		System.out.println("Testcase4");
	
	}
	
	@Test()
	public void testcase5() {
		System.out.println("testcase5");
	
	}
	
	@Test(enabled=false)
	public void Testcase6() {
		System.out.println("Testcase6");
	
	}
	
	@Test()
	public void testCase7() {
		System.out.println("testCase7");
	
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("inside beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("inside afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("inside beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("inside afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("inside beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("inside afterTest");
	}
	

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("inside afterSuite");
	}

}
