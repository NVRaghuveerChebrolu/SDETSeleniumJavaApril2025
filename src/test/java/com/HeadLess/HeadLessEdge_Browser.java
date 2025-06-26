package com.HeadLess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Constants;
import com.Utility.Library;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessEdge_Browser extends Library {
	WebDriver HeadlessDriver;
	@Test(priority = 0)
	public void ExecutingInHtmlUnidriver() throws Exception {
		ReadPropertiesFile();
		EdgeOptions edgeOptions =new EdgeOptions();
		edgeOptions.addArguments("headless");
		//WebDriverManager.edgedriver().setup();
		HeadlessDriver = new EdgeDriver(edgeOptions);
		
		HeadlessDriver.get(objProp.getProperty("GmoOnLineAppURL"));
		String GmoOnlineTitle = HeadlessDriver.getTitle();
		System.out.println("GmoOnlineTitle:"+GmoOnlineTitle); 
		Assert.assertEquals(GmoOnlineTitle, "Welcome to Green Mountain Outpost");
	}
	
	@Test(priority = 1, dependsOnMethods = { "ExecutingInHtmlUnidriver" })
	public void EnterGMOnline() {
		System.out.println("inside EnterGMOnline");
		//extent_Test = extent_Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName());
		// driver.findElement(By.name(Orep.submitbuttonGmoOnline)).click();
		HeadlessDriver.findElement(By.name("bSubmit")).click();
		//String text = HeadlessDriver.findElement(By.xpath("//h1[contains(text(),'OnLine Catalog')]")).getText();
		//library_BusinessFunctions.FindElementUsingHeadLess(HeadlessDriver,Orep.submitbuttonGmoOnline).click();
		String text = HeadlessDriver.findElement(By.xpath("//h1[text()='OnLine Catalog']")).getText();
		Assert.assertEquals(text, "OnLine Catalog");
	}

	@Test(priority = 2, dependsOnMethods = { "EnterGMOnline" })
	public void OrderQtyHikingBoots() {
		System.out.println("inside OrderQtyHikingBoots");
		//extent_Test = extent_Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName());
		HeadlessDriver.findElement(By.xpath("//input[@name='QTY_BOOTS']")).sendKeys("4");
		HeadlessDriver.findElement(By.name("bSubmit")).click();
		//waitForPageToLoad();
		String PlaceOrder = HeadlessDriver.getTitle();
		System.out.println(PlaceOrder);
		Assert.assertEquals(PlaceOrder, objProp.getProperty("TitleOfPlaceOrderPage"));
		String UnitPrice = HeadlessDriver
				.findElement(By.xpath("//table[@cellpadding='4' and @cellspacing='1']/tbody/tr[2]/td[4]")).getText();
		System.out.println("UnitPrice_HikingBoots: " + UnitPrice);
		System.out.println(UnitPrice.length());
		String Unit_Price = UnitPrice.substring(2).trim();
		float Unit_Price_float = Float.parseFloat(Unit_Price);
		System.out.println("Unit_Price_float:" + Unit_Price_float);
		float TotalCalculatedFloatPrice = Unit_Price_float * 4;
		System.out.println("TotalCalculatedFloatPrice: " + TotalCalculatedFloatPrice);
		String TotalPrice = HeadlessDriver
				.findElement(By.xpath("//table[@cellpadding='4' and @cellspacing='1']/tbody/tr[2]/td[5]")).getText();
		float TotalPrice_floatFromWebTable = Float.parseFloat(TotalPrice.substring(2).trim());
		System.out.println("TotalPrice_floatFromWebTable: " + TotalPrice_floatFromWebTable);
		Assert.assertEquals(TotalCalculatedFloatPrice, TotalPrice_floatFromWebTable);

	}
}
