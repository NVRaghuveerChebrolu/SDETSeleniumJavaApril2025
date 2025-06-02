package com.POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Library;

public class WebTablePOM extends Library {

	public WebTablePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@id='example']")
	public WebElement webTable;
	
	@FindBy(xpath = "//table[@id='example']/tbody/tr/td[3]")
	public List<WebElement> AllLastNames;

	@FindBy(xpath = "//button[@class='dt-paging-button next']")
	public WebElement NextPage;
	
	@FindBy(xpath = "//div[@class='dt-paging']/nav/button")
	public List<WebElement> AllNavigationPageButtons;
	
	
}
