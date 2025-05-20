package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPOM {
	public WebDriver driver;

	public AlertsPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "alertButton")
	public WebElement NormalAlertButton;
	
	@FindBy(id = "timerAlertButton")
	public WebElement timerAlertButton;
	
	@FindBy(id = "confirmButton")
	public WebElement confirmButton;
	
	@FindBy(id = "promtButton")
	public WebElement promtButton;
	
	@FindBy(id = "confirmResult")
	public WebElement confirmResult;
	
	@FindBy(id = "promptResult")
	public WebElement promptResult;

}
