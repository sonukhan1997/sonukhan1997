package com.actitime.qspiders.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
/**
 * This clas will provides the webdriver accessories to the script
 * @author shoukath
 * Implicit Wait
 */
public class WebDriverUtility {
	/**
	 * This method will suplly the time for every invocation of searchContext
	 * @author shoukath
	 * @param driver
	 */
	public void implicitWait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
