package com.framework.simple;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FFHeadlessWithScreenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","H:\\Java_Selenium\\src\\main\\java\\Driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		//Set FireFox Headless mode as TRUE
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		
		//Instantiate Web Driver and open web page
				WebDriver driver = new FirefoxDriver(options);
				driver.get("http://www.google.com");
				System.out.println("Page title is - " + driver.getTitle());
				
		//TakeScreenShots
				File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(file, new File("H:\\Java_Selenium\\temp\\headless_screenshot.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				driver.close();
			}
	}

