package com.ada.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\ada\\feature\\Adactin.feature", 
glue = "com.ada.stepdefinition", plugin = {
		"pretty", "html:cucumber\\reportdata.html", "json:cucumber\\reportada.json"})
		

public class AdaRunner extends BaseClass {

	public static WebDriver driver;

	@BeforeClass //junit 
	public static void setup() {

		driver = browserLaunch("chrome");]
				
				

	}

	
	
}
