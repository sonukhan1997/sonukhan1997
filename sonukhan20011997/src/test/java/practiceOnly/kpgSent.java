package practiceOnly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class kpgSent {
	@Test
	public  void kpgsentLuma() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		Actions actions=new Actions(driver);
		WebElement emailIDTextField = driver.findElement(By.id("email"));
		actions.sendKeys(emailIDTextField, "khanshoukatali6@gmail.com").perform();
		//emailIDTextField.sendKeys("karthikpalaneer@gmail.com");
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		actions.sendKeys(passwordTextField, "Powerstar@1997").perform();
		//passwordTextField.sendKeys("Nmj+1234");
		WebElement signinButton = driver.findElement(By.id("send2"));
		signinButton.click();
		WebElement searchTextField = driver.findElement(By.id("search"));
		actions.sendKeys(searchTextField,"jacket").sendKeys(Keys.ENTER).build().perform();
		actions.scrollByAmount(0, 600).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Adrienne Trek Jacket')]/../..//div[text()='S']"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Adrienne Trek Jacket')]/../..//div[@aria-label='Orange']")), 0, 0).click().build().perform();
		WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
	    actions.moveToElement(addToCart).click().build().perform();
		actions.scrollByAmount(0, -600).release().perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@class='action showcart']//span[text()='My Cart']"))).pause(2000).click().perform();
		WebElement cartTextfield = driver.findElement(By.xpath("//input[@type='number']"));
		actions.click(cartTextfield).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("2").pause(3000).build().perform();
		//cartTextfield.sendKeys(Keys.chord(Keys.CONTROL,"a"),"2");
		//cartTextfield.sendKeys(Keys.BACK_SPACE);
		//cartTextfield.sendKeys("2");
		//WebElement updateButton = driver.findElement(By.xpath("//button[@title='Update']"));
		actions.moveToElement(driver.findElement(By.xpath("//button[@title='Update']"))).click().pause(2000).perform();
		//updateButton.click();
		actions.moveToElement(driver.findElement(By.xpath("//button[text()='Proceed to Checkout']"))).click().build().perform();
	
		//driver.manage().window().maximize(); 
		//driver.close();
		//driver.quit();
		
	}

}