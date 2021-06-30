package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.LoginPage;
import com.cucumberFramework.testBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


 
public class loginPageStepDefinitions extends TestBase {

	LoginPage loginPage = new LoginPage(driver);
	WaitHelper waitHelper;
	
	@Given("^user is already on Login Page$")
	public void i_am_on_the_Login_page_URL() throws Throwable {
		driver.get(prop.getProperty("url"));
		waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElement(loginPage.btn_login, 60);
	}

	@Then("^I should see Log In Page$")
	public void i_should_see_Log_In_Page() throws Throwable {
		//loginPage = new LoginPage(driver);
		loginPage.btn_login.isDisplayed();
	}
	
	@When("^I click on LOGIN button$")
	public void click_on_LOGIN_button() throws Throwable {
		loginPage.btn_login.click();
	}
	

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public  void user_enters_username_and_password(String username,String password){
		
		waitHelper.WaitForElement(loginPage.userName, 60);
		loginPage.userName.sendKeys(prop.getProperty("username"));
		loginPage.password.sendKeys(prop.getProperty("password"));
		
	}

	@When("^user clicks on login button$")
	public void click_on_login_button() throws Throwable {
		loginPage.clickLoginButton();
	}
	
	
	 }
