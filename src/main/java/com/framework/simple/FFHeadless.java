package com.framework.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FFHeadless {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","H:\\Java_Selenium\\src\\main\\java\\Driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		//Set FireFox Headless mode as TRUE
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);

		//instantiate Webdriver
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://www.google.com");
		System.out.println("Page title is - " + driver.getTitle());

		//Search on Gogle Page
		driver.findElement(By.name("q")).sendKeys("Selenium webDriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		try {
			Thread.sleep(1000);
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}

		//Display number of results in Console
		System.out.println("Total Results - " + driver.findElement(By.id("resultStats")).getText());

		driver.close();

	}

}
