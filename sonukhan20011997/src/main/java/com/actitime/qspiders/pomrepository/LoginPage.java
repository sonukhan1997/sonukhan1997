package com.actitime.qspiders.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
public  LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="username")
private WebElement username;
public WebElement getUsernameTextField() {
	return username;
}

@FindBy(name="pwd")
private WebElement passwordTextField;
public WebElement passwordTextField() {
	return passwordTextField;
}

@FindBy(id="loginButton")
private WebElement loginButton;
public WebElement getLoginButton() {
	return loginButton;
}
}
