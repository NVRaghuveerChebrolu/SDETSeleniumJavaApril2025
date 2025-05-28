package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Library;

public class WindowsPOM extends Library {

	public WindowsPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "newWindowBtn")
	public WebElement newWindowButton;

	@FindBy(id = "newTabsBtn")
	public WebElement openMuntipleTabsButton;
	
	@FindBy(id = "password")
	public WebElement PasswordInBasicControlsWindow;
	
}
