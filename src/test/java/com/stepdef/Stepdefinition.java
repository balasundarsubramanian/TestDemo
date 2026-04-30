package com.stepdef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.config.ConfigReader;
import com.pageObje.PageObjectManager;
import com.pom.LoginPom;
import com.runner.TestRunner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	

	
//	LoginPom l = new LoginPom(driver);
	
//	 Homepage h = new HomePage();
//	 HotelBooking ho = new hotelBooking();
	
	PageObjectManager p = new PageObjectManager(driver);
	ConfigReader c;

	@Given("user Launch The Url")
	public void user_launch_the_url() throws IOException {
		
		c= new ConfigReader();
		
		launchUrl(c.getUrl());
		
	}

	@When("user Enter the Username in Username Field")
	public void user_enter_the_username_in_username_field() {
		
//		WebElement user = driver.findElement(By.name("username"));
		inputValue(p.getLog().getUser(), "abc@gmail.com");
	}

	@And("user Enter the password in Password field")
	public void user_enter_the_password_in_password_field() {
//		WebElement pass = driver.findElement(By.name("password"));
		inputValue(p.getLog().getPass(),"dfgwg");
		
	}

	@Then("user click Login button and navigates to home page")
	public void user_click_login_button_and_navigates_to_home_page() throws IOException {
//		WebElement log = driver.findElement(By.name("login"));
		clickOnElement(p.getLog().getLog());
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\balas\\eclipse-workspace-new26\\Cucumber10AMApr26\\Screenshot\\fb.png");
		
		FileUtils.copyFile(src, des);
		
	}

}
