package com.selenium;

import org.testng.annotations.Test;

import com.POM.AlertsPOM;
import com.POM.FramesPOM;
import com.Utility.Constants;
import com.Utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateFramesInSeleneium extends Library{
  
  @Test(priority=0)
  public void ValidateFramesInDemoAutomationTesting() {
	  System.out.println("inside ValidateFramesInDemoAutomationTesting");
	  driver.get(objProp.getProperty("FramesURL"));
	  PageLoadTimeOut(Constants.PageLoadTimeOut);
	  String title=driver.getTitle();
	  Assert.assertEquals(title, objProp.getProperty("TitleOfFrames"));
  }

  @Test(priority=1)
  public void ValidateTextBoxPresentInsideSingleFrame() {
	  System.out.println("ValidateTextBoxPresentInsideSingleFrame");
	  FramesPOM objFramesPOM = new FramesPOM();
	  driver.switchTo().frame(objFramesPOM.singleFrame);
	  objFramesPOM.textBoxInsideOuterAndInnerFrame.sendKeys(objProp.getProperty("SingleFrameText"));
	  driver.switchTo().defaultContent();
	  objFramesPOM.IframeWithInIframeButton.click();
  }
  
  @Test(priority=2)
  public void ValidateTextBoxPresentInsideIframeWithInIframe(){
	  System.out.println("inside ValidateTextBoxPresentInsideIframeWithInIframe");
	  FramesPOM obj = new FramesPOM();
	  driver.switchTo().frame(obj.OuterFrame);
	  driver.switchTo().frame(obj.InnerFrame);
	  obj.textBoxInsideOuterAndInnerFrame.sendKeys(objProp.getProperty("IframeWithInIframeText"));
	  driver.switchTo().defaultContent();
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
