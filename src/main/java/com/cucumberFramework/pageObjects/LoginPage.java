package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(name="email")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath=".//*[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(xpath=".//*[text()='Log In']")
	public WebElement btn_login;
	
	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}

}
