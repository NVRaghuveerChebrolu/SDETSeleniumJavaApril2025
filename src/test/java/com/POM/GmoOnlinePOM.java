package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmoOnlinePOM {
	public WebDriver driver;
	
	//note: if local variable and instance variable are same then we are going to use this keyword 
	//constructor : method which is having same name as a class name and it is used
	//for initializing the instance variables
	
	public GmoOnlinePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="bSubmit")
	public WebElement EnterGmoOnline;
	
	@FindBy(name="QTY_GLASSES")
	public WebElement Glacier_Sun_Glasses;
	
	@FindBy(name="bSubmit")
	public WebElement PlaceAnOrder;
	
	@FindBy(xpath="//table[@cellpadding='4' and @border='1']/tbody/tr[2]/td[4]")
	public WebElement unitPriceFromApp;
	
	@FindBy(xpath="//table[@cellpadding='4' and @border='1']/tbody/tr[2]/td[5]")
	public WebElement totalPrimeFromApp;
	
	public void ClickOnEnterGmoOnlineButton() {
		EnterGmoOnline.click();
	}

}
