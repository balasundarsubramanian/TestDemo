package com.pageObje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.LoginPom;

public class PageObjectManager {

//	To avoid multiple object creation in Stepdef

	public WebDriver driver;

	private LoginPom log;
	
//	private HotelBooking hote;

	public LoginPom getLog() {

		log = new LoginPom(driver);
		return log;
	}
	
	

	
	
	public PageObjectManager(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

}
