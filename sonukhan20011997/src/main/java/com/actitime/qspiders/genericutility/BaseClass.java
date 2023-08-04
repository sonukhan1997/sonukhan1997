package com.actitime.qspiders.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public WebDriver driver;
public FileUtility fileutils=new FileUtility();
public WebDriverUtility webdriverutils=new WebDriverUtility();

  @BeforeMethod
public void configBeforeMethod() throws IOException {
	String browsername=fileutils.readDataFromPropertyFile("browser");
	if(browsername.equals("chrome")) {
		driver=new ChromeDriver();
	} else if(browsername.equals("firefox")) {
		driver=new FirefoxDriver();
	}else if(browsername.equals("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(fileutils.readDataFromPropertyFile("url"));
}
  @AfterMethod
  public void confifAfterMethod() {
	  driver.manage().window().minimize();
		driver.quit();
	
}
}
