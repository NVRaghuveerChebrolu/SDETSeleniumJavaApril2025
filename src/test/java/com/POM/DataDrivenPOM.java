package com.POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Library;

public class DataDrivenPOM extends Library {

	public DataDrivenPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@ng-model='FirstName']")
	public WebElement AutoDemoSiteFirstName;
	
	@FindBy(xpath = "//input[@ng-model='LastName']")
	public WebElement AutoDemoSiteLastName;
	
	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	public WebElement AutoDemoSiteAdress;
	
	@FindBy(xpath = "//input[@ng-model='EmailAdress']")
	public WebElement AutoDemoSiteEmail;
	
	
	@FindBy(xpath = "//input[@ng-model='Phone']")
	public WebElement AutoDemoSitePhone;
	
	
	@FindBy(xpath = "//input[@value='Male']")
	public WebElement AutoDemoSiteGenderMale;
	
	
	@FindBy(xpath = "//input[@value='FeMale']")
	public WebElement AutoDemoSiteGenderFeMale;
	
	@FindBy(id = "checkbox1")
	public WebElement AutoDemoSiteCricket;
	
	@FindBy(id = "checkbox2")
	public WebElement AutoDemoSiteMovies;
	
	@FindBy(id = "checkbox3")
	public WebElement AutoDemoSiteHocky;
	
	
	@FindBy(xpath = "//*[@class='ui-icon ui-icon-close']")
	public WebElement closeIconOfSelectedLanguage;
	
	
	@FindBy(id = "msdd")
	public WebElement AutoDemoSiteLanguages;
	
	@FindBy(xpath = "//div[@id='msdd']/following-sibling::div/ul/li")
	public List<WebElement> AutoDemoSiteAllLanguages;
	
	@FindBy(xpath = "//*[text()='Skills']")
	public WebElement AutoDemoSiteSkillsField;
	
	@FindBy(id = "Skills")
	public WebElement AutoDemoSiteDropDownSkills;
	
	@FindBy(xpath = "//select[@id='Skills']/option")
	public List<WebElement> AutoDemoSiteAllSkills;
	
	@FindBy(xpath = "//span[@role='combobox']")
	public WebElement AutoDemoSiteSelectCountry;
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement AutoDemoSiteSelectCountryTextBox;
	
	@FindBy(xpath = "//input[@type='search']/parent::span/following-sibling::span/ul/li")
	public WebElement AutoDemoSiteSelectCountryFromTextBox;
	
	@FindBy(id = "yearbox")
	public WebElement AutoDemoSiteYear;
	
	@FindBy(xpath = "//select[@id='yearbox']/option")
	public List<WebElement> AutoDemoSiteAllYears;
	
	@FindBy(xpath = "//select[@placeholder='Month']")
	public WebElement AutoDemoSiteMonth;
	
	@FindBy(xpath = "//select[@placeholder='Month']/option")
	public List<WebElement> AutoDemoSiteAllMonths;
	
	@FindBy(xpath = "//select[@id='daybox']")
	public WebElement AutoDemoSiteDay;
	
	@FindBy(xpath = "//select[@id='daybox']/option")
	public List<WebElement> AutoDemoSiteAllDays;
	
	@FindBy(id = "firstpassword")
	public WebElement AutoDemoSitePassword;
	
	@FindBy(id = "secondpassword")
	public WebElement AutoDemoSiteConfirmPassword;
	
}
