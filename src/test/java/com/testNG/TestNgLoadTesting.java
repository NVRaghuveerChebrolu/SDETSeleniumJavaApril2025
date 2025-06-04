package com.testNG;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNgLoadTesting {
	@Test(invocationCount = 3,priority=-2)
	public void test1() {
		System.out.println(" test 1 is executed");
		System.out.println(" [Thread-" + Thread.currentThread().getId() + " test 1 is executed");
	}

	@Test(priority=0,invocationCount = 6, threadPoolSize = 3)
	public void test2() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
		String timstamp = sdf.format(date);
		System.out.println(timstamp + " [Thread-" + Thread.currentThread().getId() + " test 2 is executed");
	}

	@Test(invocationCount = 10, threadPoolSize = 5)
	public void testGoogleSearch() {
		System.out.printf("[+] Thread Id : %s is started!\n", Thread.currentThread().getId());
		
		WebDriver driver1 = new ChromeDriver();
		Date date = null;
		
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver1.get("http://www.google.com");

		String search_text = "Search";
		WebElement search_button = driver1.findElement(By.name("q"));
		String text = search_button.getAttribute("title");
		System.out.println("text is "+text);
		date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
		String timstamp = sdf.format(date);
		System.out.println(timstamp + " [Thread-" + Thread.currentThread().getId() + "]- Search button text is "
				+ driver1.getTitle());

		Assert.assertEquals(text, search_text, "Text not found!");

		System.out.printf("%n[-] Thread Id : %s Ended.\n", Thread.currentThread().getId());
		driver1.quit();//closing all the open browsers
	}
}
