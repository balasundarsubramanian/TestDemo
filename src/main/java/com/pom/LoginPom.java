package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	// int a =10;

	// @FindBy

	public WebDriver driver;

	@FindBy(name = "username")
	private WebElement user;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;

	@FindBy(name = "login")
	private WebElement log;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}
	
	

	public LoginPom(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

}
