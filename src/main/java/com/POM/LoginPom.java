package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getUser() {
		//System.out.println(pass.getText());
		return user;
	}

	public WebElement getPass() {
		System.out.println(pass.getText());
		return pass;
	}

	public WebElement getLogin() {
		System.out.println(login.getText());
		return login;
	}

	public LoginPom(WebDriver d) {

		driver = d;

		PageFactory.initElements(driver, this);

	}

}
