package com.selenium;

import org.testng.annotations.Test;

import com.POM.AlertsPOM;
import com.POM.FramesPOM;
import com.POM.MouseOperationsPOM;
import com.Utility.Constants;
import com.Utility.Library;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

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

public class ValidateMouseOperationsInSeleneium extends Library{
  
	@Test(priority=1)
	public void ValidateLoadingOfJqueryApp(){
		System.out.println("iniside ValidateLoadingOfJqueryApp");
		driver.get(objProp.getProperty("mouseOpeartionRightClick"));
		PageLoadTimeOut(Constants.PageLoadTimeOut);
		String title= driver.getTitle();
		Assert.assertEquals(title, objProp.getProperty("JQeryTitle"));
	}
	
	@Test(priority=2)
	public void ValidateRightClickOperation() throws InterruptedException {
		System.out.println("iniside ValidateRightClickOperation");
		Actions objActions = new Actions(driver);
		MouseOperationsPOM objMouseOpPOM= new MouseOperationsPOM();
		objActions.contextClick(objMouseOpPOM.RightClickMeButton).build().perform();
		objMouseOpPOM.PasteOption.click();
		Alert objAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		String TextMessageOfAlert=objAlert.getText();
		Assert.assertEquals(TextMessageOfAlert, objProp.getProperty("mouseOpeartionRightclick_PateOptionAlertText"));
		objAlert.accept();
	}
	
	@Test(priority=3)
	public void ValidateoDoubleClickOperation() {
		System.out.println("inside ValidateoDoubleClickOperation");
		driver.navigate().to(objProp.getProperty("mouseOpeartionDoubleClick"));
		PageLoadTimeOut(Constants.PageLoadTimeOut);
		MouseOperationsPOM objMousePOM = new MouseOperationsPOM();
		ScrollIntoWebElement(objMousePOM.iframe);
		driver.switchTo().frame(objMousePOM.iframe);
		String colorOfBoxBeforeDoubleCick= objMousePOM.blueColorBox.getCssValue("background-color");
		System.out.println("colorOfBoxBeforeDoubleCick:"+colorOfBoxBeforeDoubleCick);
		Assert.assertEquals(colorOfBoxBeforeDoubleCick, objProp.getProperty("colorOfBoxBeforeDoubleCick"));
		Actions objActions = new Actions(driver);
		objActions.doubleClick(objMousePOM.blueColorBox).build().perform();
		String colorOfBoxAfterDoubleCick= objMousePOM.blueColorBox.getCssValue("background-color");
		System.out.println("colorOfBoxAfterDoubleCick:"+colorOfBoxAfterDoubleCick);
		Assert.assertEquals(colorOfBoxAfterDoubleCick, objProp.getProperty("colorOfBoxAfterDoubleCick"));
		driver.switchTo().defaultContent();//to switch back the control to the main html page
		
	}
	
	@Test(priority=4)
	public void ValidateDragAndDrop() {
		System.out.println("inside ValidateDragAndDrop");
		driver.navigate().to(objProp.getProperty("mouseOperationDragAndDrop"));
		PageLoadTimeOut(Constants.PageLoadTimeOut);
		MouseOperationsPOM objMousePOM = new MouseOperationsPOM();
		ScrollIntoWebElement(objMousePOM.DragAndDropiframe);
		driver.switchTo().frame(objMousePOM.DragAndDropiframe);
		Actions objActions = new Actions(driver);
		//objActions.clickAndHold(objMousePOM.draggable);
		//objActions.moveToElement(objMousePOM.droppable).build().perform();
		objActions.dragAndDrop(objMousePOM.draggable, objMousePOM.droppable).build().perform();
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
