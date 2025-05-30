package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Library {

	public static Properties objProp ;
	public WebDriver driver;
	
	public void ReadPropertiesFile() throws IOException {
		File objFile = new File(System.getProperty("user.dir")+"//src//test//resources//Config.properties");
		try {
			//class used for reading the data from the file
			FileInputStream objFileInput = new FileInputStream(objFile);
			objProp = new Properties();
			objProp.load(objFileInput);
			System.out.println(objProp.getProperty("GmoOnlineAppURL"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void LaunchBrowser() {
		String browserFromPropFile = objProp.getProperty("browser");
		switch(browserFromPropFile.toLowerCase()) {
		case "chrome":
			//driver=new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			File objFile = new File (System.getProperty("user.dir")+"//addBlocker//extension_5.21.0.crx");
			options.addExtensions(objFile);
			driver=new ChromeDriver(options);
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "ie":
			driver=new InternetExplorerDriver();
			break;	
		default:
			System.out.print("Please provide broswer name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.ImplicitWaitTimeOut));
	}
	
	public void PageLoadTimeOut(int seconds) {
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));
	}
	
	public void ScrollIntoWebElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//js.executeScript("window.scrollBy(0,250)", "");// to perform scroll down operation by 250 pixels 
		//js.executeScript("window.scrollBy(0,-340)", "");// to perform scroll up operation by 340 pixels 
		//js.executeScript("window.scrollBy(250,0)", "");// to perform scroll right operation by 250 pixels 
		//js.executeScript("window.scrollBy(-550,0)", "");// to perform scroll left operation by 550 pixels 
	}
	
	
}
