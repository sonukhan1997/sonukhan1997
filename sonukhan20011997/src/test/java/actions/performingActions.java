package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class performingActions {
	@Test
	public void actions(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	//Actions class
	Actions actions=new Actions(driver);
	//actions.click(loginButton).perform();
	//actions.moveToElement(loginButton).click().perform();
	//actions.moveToElement(loginButton).contextClick().perform();
	WebElement image = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	//actions.moveToElement(image).contextClick().perform();
	//actions.contextClick(image).perform();
	//actions.contextClick().perform();
	//=====================================================================
	actions.sendKeys("sonukhan").perform();
	actions.pause(2000).perform();
	actions.sendKeys(Keys.TAB).pause(4000).sendKeys("hdhkhkshf").perform();
	
}
}
