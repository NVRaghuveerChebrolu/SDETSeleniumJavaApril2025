package com.selenium;

import org.testng.annotations.Test;

import com.POM.AlertsPOM;
import com.POM.DropDownAndCalenderPOM;
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
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateDropDownsAndCalender extends Library {

	
	@Test(priority = 1)
	public void ValidateDropDownsDemoQAPracticeFormLoded() {
		System.out.println("inside ValidateDropDownsDemoQAPracticeFormLoded");
		driver.get(objProp.getProperty("CalenderAndDropDownURL"));
		PageLoadTimeOut(Constants.PageLoadTimeOut);
		Assert.assertEquals(driver.getTitle(), objProp.getProperty("TitleOfDemoQA"));
	}
	
	@Test(priority = 2)
	public void ValidateDropDownsAndCalender() {
		System.out.println("inside ValidateDropDownsAndCalender");
		DropDownAndCalenderPOM objCalenderAndDD= new DropDownAndCalenderPOM();
		ScrollIntoWebElement(objCalenderAndDD.dateOfBirth);
		objCalenderAndDD.dateOfBirth.click();
		
		Select objselect = new Select(objCalenderAndDD.monthDropDown);
		objselect.selectByVisibleText(objProp.getProperty("SelectMonth"));
		
		Select objselect1 = new Select(objCalenderAndDD.yearDropDown);
		objselect1.selectByValue(objProp.getProperty("SelectYear"));
		
		List<WebElement>AllCalenderDays = objCalenderAndDD.AllDays;
		for(int i=0;i<=AllCalenderDays.size()-1;i++) {
			String DayFromCalender=AllCalenderDays.get(i).getText();
			if(DayFromCalender.equals(objProp.getProperty("CalenderDay"))) {
				AllCalenderDays.get(i).click();
				break;
			}
//			if(DayFromCalender.equals(String.valueOf(randomCalenderDayvalue()))) {
//				AllCalenderDays.get(i).click();
//				break;
//			}
		}
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
