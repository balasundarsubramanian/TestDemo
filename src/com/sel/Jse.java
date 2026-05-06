package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jse {

	
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");   //scroll down
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)");  //scroll up
		
//		
//		WebElement top = driver.findElement(By.xpath("//div[text()='Back to top']"));
//		js.executeScript("arguments[0].scrollIntoView();",top);
//		
		
		js.executeScript("arguments[0].click();",top);
		
		 WebDriverWait wait = new WebDriverWait (driver,30);

			wait.until(ExpectedConditions.visibilityOf(top));
		
			Wait wait1 = new FluentWait(driver)

				    .withTimeout(30, TimeUnit.SECONDS)

				    .pollingEvery(5, TimeUnit.SECONDS)

				    .ignoring(Exception.class);
	}
}
