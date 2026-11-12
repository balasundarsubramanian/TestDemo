package com.ada.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObj.PageObjectManager;
import com.ada.runner.AdaRunner;
import com.base.BaseClass;
import com.propertyfileReader.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdaStepdefinition extends BaseClass {

	public static WebDriver driver = AdaRunner.driver;

	// LoginPom l = new LoginPom();

	PageObjectManager p = new PageObjectManager(driver);

	ConfigurationReader c;

	@Given("user launch the url of the adactin")
	public void user_launch_the_url_of_the_adactin() throws IOException {
		c = new ConfigurationReader();

		// urlLaunch("https://adactinhotelapp.com/");

		// System.out.println(driver);
		urlLaunch(c.getUrl());
	}

	@When("user enter  in the username field")
	public void user_enter_in_the_username_field() {

		inputValue(p.getLogin().getUser(), c.getUser());
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user enter  in the password field")
	public void user_enter_in_the_password_field() {
		// inputValue(p.getLogin().getLogin(), "nnmn");

		inputValue(p.getLogin().getPass(), c.getPass());
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("user should click the login and it will be navigate to the search page")
	public void user_should_click_the_login_and_it_will_be_navigate_to_the_search_page() {

		clk(p.getLogin().getLogin());

		// Write code here that turns the phrase above into concrete actions
	}

}
