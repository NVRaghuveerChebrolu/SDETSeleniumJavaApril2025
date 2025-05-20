package com.selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.POM.AlertsPOM;
import com.Utility.Constants;
import com.Utility.Library;

public class AlertsInSelenium extends Library {

	@Test(priority = -3)
	public void launchDemoToolsQA() {
		System.out.println("inside launchDemoToolsQA");
		driver.get(objProp.getProperty("AlertsURL"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PageLoadTimeOut));
		Assert.assertEquals(driver.getTitle(),objProp.getProperty("TitleOfDemoQA"));
	}
	
	@Test()
	public void validateNormalAlert() {
		System.out.println("inside validateNormalAlert");
		//driver.findElement(By.id("alertButton")).click();
		AlertsPOM objAlertsPOM = new AlertsPOM(driver);
		objAlertsPOM.NormalAlertButton.click();
		Alert obj = driver.switchTo().alert();
		String textOfAlert = obj.getText();
		System.out.println("textOfAlert: "+textOfAlert);
		Assert.assertEquals(textOfAlert, objProp.getProperty("TextMessageOfNormalAlert"));
		obj.accept();
	}
	
	@Test(priority=2)
	  public void ValidateTimerAlertOnDemoQA() throws InterruptedException {
		  System.out.println("inside ValidateTimerAlertOnDemoQA");
		  //ExtTest=ExtReports.createTest(new Object() {}.getClass().getEnclosingMethod().getName());
		  AlertsPOM objPOM= new AlertsPOM(driver);
		  objPOM.timerAlertButton.click();
		  //explicit wait : applicable for one webElement
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.alertIsPresent());
		  Alert objAlert =driver.switchTo().alert();
		  Thread.sleep(3000);
		  String textOftimerAlert = objAlert.getText();
		  Assert.assertEquals(textOftimerAlert, objProp.getProperty("TextMessageOfTimerAlert"));
		  objAlert.accept();
	  }
	  
	  @Test(priority=3)
	  public void ValidateConfirmBoxAlertOnDemoQA() {
		  System.out.println("inside ValidateConfirmBoxAlertOnDemoQA");
		 // ExtTest=ExtReports.createTest(new Object() {}.getClass().getEnclosingMethod().getName());
		  AlertsPOM objPOM = new AlertsPOM(driver);
		  objPOM.confirmButton.click();
		  Alert objAlert = driver.switchTo().alert();
		  String textOfConfirmBoxAlert = objAlert.getText();
		  Assert.assertEquals(textOfConfirmBoxAlert, objProp.getProperty("TextMessageOfConfirmBoxAlert"));
		  objAlert.dismiss();
		  boolean ConfirmAlertResult = objPOM.confirmResult.isDisplayed();
		  //Assert.assertEquals(ConfirmAlertResult, true);
		  Assert.assertTrue(ConfirmAlertResult, "ConfirmAlertResult message is not displayed");
	  }
	  
	  @Test(priority=4)
	  public void ValidatePromptBoxAlertonDemoQA() {
		  System.out.println("inisde ValidatePromptBoxAlertonDemoQA");
		//  ExtTest=ExtReports.createTest(new Object() {}.getClass().getEnclosingMethod().getName());
		  AlertsPOM objAlertsPOM =new AlertsPOM(driver);
		  objAlertsPOM.promtButton.click();
		  Alert objAlert = driver.switchTo().alert();
		  String TextDisplayed = objAlert.getText();
		  Assert.assertEquals(TextDisplayed, objProp.getProperty("TextMessageOfPropmtBoxAlert"));
		  objAlert.sendKeys(objProp.getProperty("PromptBoxMessageEntered"));
		  objAlert.accept();
		  String PromptBoxResultMessageDisplayed=objAlertsPOM.promptResult.getText();
		  Assert.assertEquals(PromptBoxResultMessageDisplayed, objProp.getProperty("PrompBoxResult"));
	  }

	@BeforeSuite
	public void readPropertyFile() throws IOException {
		System.out.println("inside the BeforeSuite Annotation");
		ReadPropertiesFile();
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("inside the BeforeTest Annotation");
		LaunchBrowser();
	}

}
