package com.actitime.qspiders.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.qspiders.genericutility.BaseClass;
import com.actitime.qspiders.pomrepository.HomePage;
import com.actitime.qspiders.pomrepository.LoginPage;

public class EndToEnd extends BaseClass {
	@Test
public void loginLogout() throws IOException 
	
 {
	webdriverutils.implicitWait(driver);
	LoginPage loginPage=new LoginPage(driver);
	
	WebElement usernameTextField = loginPage.getUsernameTextField();
	usernameTextField.sendKeys(fileutils.readDataFromPropertyFile("username"));
	WebElement passwordTextField = loginPage.passwordTextField();
	passwordTextField.sendKeys(fileutils.readDataFromPropertyFile("password"));
	WebElement loginButton = loginPage.getLoginButton();
	loginButton.click();
	
	HomePage homePage=new HomePage(driver);
	WebElement logoutOption = homePage.getLogoutOption();
	logoutOption.click();
	
}
}
