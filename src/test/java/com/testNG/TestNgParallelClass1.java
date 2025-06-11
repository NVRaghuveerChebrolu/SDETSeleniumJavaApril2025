package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNgParallelClass1 {
	WebDriver driver;
@BeforeClass
public void beforeClass() {
long id = Thread.currentThread().getId();
System.out.println("Class1 : inside Before class. Thread id is: " + id);
driver= new EdgeDriver();
driver.get("https://www.google.co.in/");
}

@Test
public void testMethodOne() {
long id = Thread.currentThread().getId();
System.out.println("Class1 : inside testMethodOne. Thread id is: " +id);
}

@Test
public void testMethodTwo() {
long id = Thread.currentThread().getId();
System.out.println("Class1 : inside testMethodTwo. Thread id is: " +id);
}

@AfterClass
public void afterClass() {
long id = Thread.currentThread().getId();
System.out.println("Class1 : inside After class. Thread id is: " + id);
//driver.close();
}
}
