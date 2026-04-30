package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jse {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		Thread.sleep(5000);
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");   //scroll down
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)");  //scroll up
		
//		
//		WebElement top = driver.findElement(By.xpath("//div[text()='Back to top']"));
//		js.executeScript("arguments[0].scrollIntoView();",top);
		
		WebDriverWait wait = new 
//		
	}

}
