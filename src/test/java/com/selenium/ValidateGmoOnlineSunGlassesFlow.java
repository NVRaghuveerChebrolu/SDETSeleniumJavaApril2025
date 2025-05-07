package com.selenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POM.GmoOnlinePOM;
import com.Utility.Constants;
import com.Utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateGmoOnlineSunGlassesFlow extends Library {

	@Test(priority = 0)
	public void ValidateLaunchOfGmoOnlineApplication() {
		System.out.println("inside ValidateLaunchOfGmoOnlineApplication");
		driver.get(objProp.getProperty("GmoOnLineAppURL"));
		PageLoadTimeOut(Constants.PageLoadTimeOut);
		String titleOfGMO_OnlineApp = driver.getTitle();
		Assert.assertEquals(titleOfGMO_OnlineApp, objProp.getProperty("TitleOfGmoOnlineHomePage"));
	}

	@Test(priority = 1,dependsOnMethods = {"ValidateLaunchOfGmoOnlineApplication"})
	public void ValidateGlacierSunGlassesProduct() throws InterruptedException {
		GmoOnlinePOM objPOM = new GmoOnlinePOM(driver);
		//objPOM.EnterGmoOnline.click();
		objPOM.ClickOnEnterGmoOnlineButton();
		PageLoadTimeOut(Constants.PageLoadTimeOut);
		String titleOfOnlineCatalog = driver.getTitle();
		// hard assertion : if the validation step got failed, then it wont proceed
		// further and mark the test case as failure
		Assert.assertEquals(titleOfOnlineCatalog, objProp.getProperty("titleOfOnlineCatalogPage"));
		objPOM.Glacier_Sun_Glasses.clear();
		Thread.sleep(3000);
		objPOM.Glacier_Sun_Glasses.sendKeys(Constants.Glacier_Sun_Glasses_QTY);
		Thread.sleep(3000);
		objPOM.PlaceAnOrder.click();
		PageLoadTimeOut(Constants.PageLoadTimeOut);
	}

	@Test(priority = 2,dependsOnMethods = {"ValidateLaunchOfGmoOnlineApplication","ValidateGlacierSunGlassesProduct"})
	public void ValidatePriceCalculationOnPlaceOrderPage() {
		String titleOfPlaceOrder = driver.getTitle();
		// Soft Assertion : It will continue execution even if validation step got
		// failed
		SoftAssert objSoftAssert = new SoftAssert();
		GmoOnlinePOM objPOM = new GmoOnlinePOM(driver);
		objSoftAssert.assertEquals(titleOfPlaceOrder, objProp.getProperty("TitleOfPlaceOrderPage"));
		
		String unitPriceFromApp = objPOM.unitPriceFromApp.getText();
		System.out.println("unitPriceFromApp:" + unitPriceFromApp);
		String ActualUnitPriceFromAppWithoutDoller = unitPriceFromApp.substring(Constants.UnitPriceSubStringIndex);
		System.out.println("ActualUnitPriceFromAppWithoutDoller:" + ActualUnitPriceFromAppWithoutDoller);
		float floatValueOfUnitPrice = Float.parseFloat(ActualUnitPriceFromAppWithoutDoller);
		float calculatedValueOfUnitPrice = floatValueOfUnitPrice * Integer.parseInt(Constants.Glacier_Sun_Glasses_QTY);
		System.out.println("calculatedValueOfUnitPrice:" + calculatedValueOfUnitPrice);

		String TotalPriceFromApp = objPOM.totalPrimeFromApp.getText();
		System.out.println("TotalPriceFromApp:" + TotalPriceFromApp);
		String TotalPriceFromAppWithoutDoller = TotalPriceFromApp.substring(2);
		Float TotalPriceFromAppWithoutDollerinFloat = Float.parseFloat(TotalPriceFromAppWithoutDoller);
		Assert.assertEquals(calculatedValueOfUnitPrice, TotalPriceFromAppWithoutDollerinFloat);
		objSoftAssert.assertAll();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("inisde beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("inisde AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("inisde beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("inisde afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("inisde beforeTest");
		LaunchBrowser();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("inisde afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inisde beforeSuite");
		try {
			ReadPropertiesFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("inisde afterSuite");
	}
}
