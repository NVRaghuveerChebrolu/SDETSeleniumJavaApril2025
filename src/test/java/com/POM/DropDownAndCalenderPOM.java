package com.POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Library;

public class DropDownAndCalenderPOM extends Library {

	public DropDownAndCalenderPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "dateOfBirthInput")
	public WebElement dateOfBirth;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	public WebElement monthDropDown;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	public WebElement yearDropDown;
	
	@FindBy(xpath="//div[@class='react-datepicker__month']/div/div")
	public List<WebElement> AllDays;
	
}
