package practiceOnly;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubtNo1 {
	
	@BeforeSuite
	public void Setup() {
		System.out.println("set up the chrome"+"  before Suite");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch the Browser"+"  before Class");
	}
	@BeforeTest
	public void login() {
		System.out.println("login to the application"+"  before Test");
	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter the respective Url"+"  before Method");
	}
	@Test
	public void endToEnd() {
		System.out.println("Executing the main TestCase"+"  ACTUAL TESTCASE");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from the application"+"  after Method");
	}
	@AfterTest
	public void cookies() {
		System.out.println("delete all cookies"+"  after Test");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("close the opened browser"+"  after Class");
	}
	@AfterSuite
	public void htmlReport() {
		System.out.println("generate the html report"+"  after Suite");
	}
	

}
/**
 before Suite
 before Test
 before Class
 before Method
 ACTUAL TESTCASE
 after Method
 after Class
 after Test
**/
