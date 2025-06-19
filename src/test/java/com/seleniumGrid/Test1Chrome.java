package com.seleniumGrid;

import org.testng.annotations.Test;

import com.Utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test1Chrome extends Library {
  @Test
  public void testCaseChrome() throws InterruptedException {
	  System.out.println("inside testCaseChrome");
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(15000);
	  System.out.println(driver.getTitle() +"from Chrome");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside beforeMethod");
	  driver = getBrowserCapabilities("chrome");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside afterMethod");
	  driver.quit();
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
