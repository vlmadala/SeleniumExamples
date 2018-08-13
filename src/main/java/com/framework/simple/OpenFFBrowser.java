package com.framework.simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFFBrowser {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","H:\\Java_Selenium\\src\\main\\java\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	/*
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("/Java_Selenium/src/main/java/Driver/geckodriver.exe"); //Location where Firefox is installed
 
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("moz:firefoxOptions", options);
		//set more capabilities as per your requirements
 
		FirefoxDriver ffdriver = new FirefoxDriver(capabilities);*/
		driver.get("http://www.google.com");
	}
}
