package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\balas\\eclipse-workspace-new26\\Cucumber10AMApr26\\src\\test\\java\\com\\feature\\Adactin.feature",
glue="com.stepdef",plugin= {"pretty","html:CucumberReport//Reportdata.html",
		"json:CucumberReport//Reportdata.json"},tags="@scenarioSmoke")
public class TestRunner extends BaseClass {
	
   @BeforeClass
	public static void setup() {
		
		browserLaunch("chrome");
	}
	
   
 
   
	
//	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
//	
	
	

}
