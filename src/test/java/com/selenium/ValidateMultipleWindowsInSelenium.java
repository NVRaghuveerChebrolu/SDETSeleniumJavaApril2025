package com.selenium;

import org.testng.annotations.Test;

import com.POM.AlertsPOM;
import com.POM.FramesPOM;
import com.POM.MouseOperationsPOM;
import com.POM.WindowsPOM;
import com.Utility.Constants;
import com.Utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateMultipleWindowsInSelenium extends Library {

	@Test(priority = 1)
	public void ValidateLoadingOfhyrtutorials() {
		System.out.println("iniside ValidateLoadingOfhyrtutorials");
		driver.get(objProp.getProperty("WindowsURL"));
		PageLoadTimeOut(Constants.PageLoadTimeOut);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, objProp.getProperty("TitleOfhyrtutorials"));
	}

	@Test(priority = 2)
	public void ValidateOpenNewWindow() {
		System.out.println("inside ValidateOpenNewWindow");
		WindowsPOM objWindowsPOM = new WindowsPOM();
		ScrollIntoWebElement(objWindowsPOM.newWindowButton);
		String ParentWindow = driver.getWindowHandle();
		objWindowsPOM.newWindowButton.click();
		PageLoadTimeOut(Constants.PageLoadTimeOut);
		Set<String> AllWindows = driver.getWindowHandles();
		System.out.println("number of windows :"+AllWindows.size());
		boolean flag =false;
		for(String window:AllWindows) {
			driver.switchTo().window(window);
			String Title = driver.getTitle();
			System.out.println("Title:"+Title);
			if(Title.equalsIgnoreCase(objProp.getProperty("NewWindowTitile"))) {
				driver.manage().window().maximize();
				String pageSourse = driver.getPageSource();
				if(pageSourse.contains(objProp.getProperty("TextPresentInNewWindow"))) {
					flag=true;
					//Assert.assertEquals(flag, true);
					Assert.assertTrue(flag, "TextPresentInNewWindow is not validated");
				}
				ScrollIntoWebElement(objWindowsPOM.PasswordInBasicControlsWindow);
				objWindowsPOM.PasswordInBasicControlsWindow.sendKeys(objProp.getProperty("passwrodEnteredinBasucControlsPage"));
				driver.manage().window().minimize();
				driver.close();
			
			}
		}
		driver.switchTo().window(ParentWindow);
		Assert.assertEquals(driver.getTitle(),objProp.getProperty("TitleOfhyrtutorials"));
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("inside beforeTest");
		LaunchBrowser();
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside beforeSuite");
		try {
			ReadPropertiesFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterSuite
	public void afterSuite() {
	}

}
