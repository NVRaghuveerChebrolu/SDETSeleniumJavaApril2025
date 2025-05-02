package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Utility.Library;

public class FirstSeleniumProgram extends Library{
	static WebDriver driver;//instance variable
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.borland.com/gmopost/");
		Library objLibrary = new Library();
		objLibrary.ReadPropertirsFile();
		driver.get(objProp.getProperty("GmoOnlineAppURL"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		Assert.assertEquals(driver.getTitle(),objProp.getProperty("GmoOnlineAppTitle"));
	//	driver.close();
		
	}

}
