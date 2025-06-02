package com.selenium;

import org.testng.annotations.Test;

import com.POM.AlertsPOM;
import com.POM.FramesPOM;
import com.POM.MouseOperationsPOM;
import com.POM.WebTablePOM;
import com.POM.WindowsPOM;
import com.Utility.Constants;
import com.Utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateWebTableInDataTables extends Library {

	@Test(priority = 1)
	public void ValidateDatablePageLoaded() {
		System.out.println("inside ValidateDatablePageLoaded");
		ExtTest=ExtReports.createTest(new Object() {}.getClass().getEnclosingMethod().getName());
		driver.get(objProp.getProperty("WebTableURL"));
		PageLoadTimeOut(Constants.pageLoadTimeOut);
		Assert.assertEquals(driver.getTitle(), objProp.getProperty("TitleOfWebTable"));
	}

	@Test(priority = 2)
	public void ValidateWebTableCntentsBasedOnLastName() {
		System.out.println("inside ValidateWebTableCntentsBasedOnLastName");
		ExtTest=ExtReports.createTest(new Object() {}.getClass().getEnclosingMethod().getName());
		WebTablePOM objWebTablePOM = new WebTablePOM();
		ScrollIntoWebElement(objWebTablePOM.webTable);
		List<WebElement> AllLastNames = objWebTablePOM.AllLastNames;
		System.out.println("Number Of LastNames:" + AllLastNames.size());
		HashMap<String, String> WebTableContent = new HashMap<String, String>();
		int numbersOfPages = objWebTablePOM.AllNavigationPageButtons.size() - 4;
		for (int page = 1; page <= numbersOfPages; page++) {
			System.out.println("we are at page number:"+page);
			for (int row = 0; row <= AllLastNames.size() - 1; row++) {
				String LastName = AllLastNames.get(row).getText();
				System.out.println("LastName at " + row + " is: " + LastName);
				if (LastName.equalsIgnoreCase(objProp.getProperty("WebTableLastName"))) {
					row = row + 1;
					String firstName = driver
							.findElement(By.xpath("//table[@id='example']/tbody/tr[" + row + "]/td[2]")).getText();
					String position = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + row + "]/td[4]"))
							.getText();
					String office = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + row + "]td[5]"))
							.getText();
					String startDate = driver
							.findElement(By.xpath("//table[@id='example']/tbody/tr[" + row + "]/td[6]")).getText();
					String salary = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + row + "]/td[7]"))
							.getText();
					WebTableContent.put("FirstName", firstName);
					WebTableContent.put("LastName", LastName);
					WebTableContent.put("Position", position);
					WebTableContent.put("StartDate", startDate);
					WebTableContent.put("Office", office);
					WebTableContent.put("Salary", salary);
					break;
				}
			}
			if (WebTableContent.isEmpty()) {
				objWebTablePOM.NextPage.click();
			}else if(!WebTableContent.isEmpty()) {
				break;
			}
		}
		for (Map.Entry<String, String> map : WebTableContent.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod(ITestResult result ) {
		UpdatingResultInExtentReport(result);
	}

	@BeforeClass
	public void beforeClass() {
		StartExtentReport();
	}

	@AfterClass
	public void afterClass() {
		FlushReport();
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
