package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;

	
	public static void browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
		
		
		
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void maxi() {
		driver.manage().window().maximize();
	}
	
	public static void inputValue(WebElement ele, String value) {
		
		ele.sendKeys(value);
		
	}
	
	public static void clickOnElement(WebElement el) {
		el.click();
	}
	
	
}
