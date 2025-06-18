package com.BDD;

import java.io.IOException;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.POM.GmoOnlinePOM;
import com.Utility.Constants;
import com.Utility.Library;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmoOnlineSteps extends Library {

	@Given("User is on Gmo online page")
	public void user_is_on_gmo_online_page() throws IOException {
		ReadPropertiesFile();
		LaunchBrowser();
		driver.get(objProp.getProperty("GmoOnLineAppURL"));
	}

	@Then("I validate the title")
	public void i_validate_the_title() {
		String title = driver.getTitle();
		Assert.assertEquals(title, objProp.get("TitleOfGmoOnlineHomePage"));
	}

	@When("user click on Enter Gmo Online Button")
	public void user_click_on_enter_gmo_online_button() {
		GmoOnlinePOM objGmoOnlinePOM = new GmoOnlinePOM(driver);
		objGmoOnlinePOM.EnterGmoOnline.click();

	}

	@Given("User is on online catalogue page")
	public void user_is_on_online_catalogue_page() {

	}

	@Then("verify the title of Onlicatalogue Page")
	public void verify_the_title_of_onlicatalogue_page() {
		String titleOfOnlineCataloguePage = driver.getTitle();
		Assert.assertEquals(titleOfOnlineCataloguePage, objProp.get("titleOfOnlineCatalogPage"));
	}

	@When("user provide quantity for sun glasses product")
	public void user_provide_quantity_for_sun_glasses_product() throws InterruptedException {
		GmoOnlinePOM objPOM = new GmoOnlinePOM(driver);
		objPOM.Glacier_Sun_Glasses.clear();
		Thread.sleep(3000);
		objPOM.Glacier_Sun_Glasses.sendKeys(Constants.Glacier_Sun_Glasses_QTY);
		Thread.sleep(3000);
	}

	@When("usr click on Place An Order button")
	public void usr_click_on_place_an_order_button() {
		GmoOnlinePOM objPOM = new GmoOnlinePOM(driver);
		objPOM.PlaceAnOrder.click();
		PageLoadTimeOut(Constants.PageLoadTimeOut);
	}

	@Then("verify the title of Place order page")
	public void verify_the_title_of_place_order_page() {
		String titleOfPlaceOrder = driver.getTitle();

		SoftAssert objSoftAssert = new SoftAssert();
		GmoOnlinePOM objPOM = new GmoOnlinePOM(driver);
		objSoftAssert.assertEquals(titleOfPlaceOrder, objProp.getProperty("TitleOfPlaceOrderPage"));
	}

	@Then("veriy the unit prce and total price calculated")
	public void veriy_the_unit_prce_and_total_price_calculated() {
		// Soft Assertion : It will continue execution even if validation step got
		// failed
		SoftAssert objSoftAssert = new SoftAssert();
		GmoOnlinePOM objPOM = new GmoOnlinePOM(driver);
		String unitPriceFromApp = objPOM.unitPriceFromApp.getText();
		System.out.println("unitPriceFromApp:" + unitPriceFromApp);
		String ActualUnitPriceFromAppWithoutDoller = unitPriceFromApp.substring(Constants.UnitPriceSubStringIndex);
		System.out.println("ActualUnitPriceFromAppWithoutDoller:" + ActualUnitPriceFromAppWithoutDoller);
		float floatValueOfUnitPrice = Float.parseFloat(ActualUnitPriceFromAppWithoutDoller);
		float calculatedValueOfUnitPrice = floatValueOfUnitPrice * Integer.parseInt(Constants.Glacier_Sun_Glasses_QTY);
		System.out.println("calculatedValueOfUnitPrice:" + calculatedValueOfUnitPrice);
		String TotalPriceFromApp = objPOM.totalPrimeFromApp.getText();
		System.out.println("TotalPriceFromApp:" + TotalPriceFromApp);
		String TotalPriceFromAppWithoutDoller = TotalPriceFromApp.substring(2);
		Float TotalPriceFromAppWithoutDollerinFloat = Float.parseFloat(TotalPriceFromAppWithoutDoller);
		Assert.assertEquals(calculatedValueOfUnitPrice, TotalPriceFromAppWithoutDollerinFloat);
		objSoftAssert.assertAll();
	}

	@Given("^User is on login page$")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}

	@When("User provides userName as {string} and password as {string}")
	public void user_provides_user_name_as_and_password_as(String userName, String password) {
		System.out.println("userName is:"+userName);
		System.out.println("password is:"+password);
	}

	@And("^User click on submit button$")
	public void user_click_on_submit_button() {
		System.out.println("user clicks on submit button");
	}

	@Then("^User is on Home Page$")
	public void user_is_on_home_page() {
		System.out.println("user is on Home Page");
	}

}
