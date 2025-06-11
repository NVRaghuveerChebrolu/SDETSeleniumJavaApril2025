package com.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGParallelTestSuite {
	String Browser = "";
	WebDriver driver;
	@BeforeTest
	@Parameters({ "Browser" })
	public void beforeTest(String Browser) {
		this.Browser = Browser;
		long id = Thread.currentThread().getId();
		System.out.println("Before test " + Browser + ". Thread id is: " + id);
		if(Browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("edge")){
			driver= new EdgeDriver();
		}
	}

	@BeforeClass
	public void beforeClass() {
		long id = Thread.currentThread().getId();
		System.out.println("Before test-class " + Browser + ". Thread id is: " + id);
	}

	@Test
	public void testMethodOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Sample test-method " + Browser + ". Thread id is: " + id);
	}

	@AfterClass
	public void afterClass() {
		long id = Thread.currentThread().getId();
		System.out.println("After test-class  " + Browser + ". Thread id is: " + id);
	}

	@AfterTest
	public void afterTest() {
		long id = Thread.currentThread().getId();
		System.out.println("After test  " + Browser + ". Thread id is: " + id);
	}

}
