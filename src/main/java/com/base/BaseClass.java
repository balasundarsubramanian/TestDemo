package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String type) {

		if (type.equalsIgnoreCase("chrome")) {

//			System.setProperty("webdriver.chrome.driver",
//					System.getProperty("user.dir") + "//Driver//chromedriverl.exe");

			 WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("edge")) {
			// System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +
			// "//Driver//msedgedriver.exe");

			// WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		}
		return driver;

	}

	public static void maxi() {
		driver.manage().window().maximize();
	}

	public static void urlLaunch(String url) {
		driver.get(url);

	}

	public static void inputValue(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	public static void clk(WebElement element) {

		element.click();

	}

	public static void snap(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\balas\\eclipse-workspace\\Project10.30AM\\Screenshot\\" + name + ".png");
		FileUtils.copyFile(src, des);

	}

	public static void cancel() {
		driver.close();
	}

	public static void qu() {
		driver.quit();
	}

}
