package practiceOnly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class chaitramadam {
@Test
public void Tc_001() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
	String expectedLoginPageTitle="Facebook – log in or sign up";
	String actualLoginPageTitle = driver.getTitle();
	if(actualLoginPageTitle.equals("Facebook – log in or sign up")) {
		WebElement emailTextField = driver.findElement(By.id("email"));
		 if(emailTextField.getAttribute("value").isEmpty()){
			emailTextField.sendKeys("9449060109");
			WebElement passwordTextField = driver.findElement(By.id("pass"));
			if(passwordTextField.getAttribute("value").isEmpty()) {
				passwordTextField.sendKeys("Powerstar@1997");
			
			}else {
				passwordTextField.clear();
				passwordTextField.sendKeys("Powerstar@1997");
				}
				WebElement loginButton = driver.findElement(By.name("login"));
				loginButton.click();
				driver.switchTo().alert().accept();
				
			
			
			
		}else {
			emailTextField.clear();
			emailTextField.sendKeys("9449060109");
		}
	}
	
	
	
	
}
}
