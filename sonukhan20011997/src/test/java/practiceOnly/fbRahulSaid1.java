package practiceOnly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class fbRahulSaid1 {
	@Test
public  void CreatingAccount() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
	driver.get("https://www.facebook.com/");
	Actions actions=new Actions(driver);
	actions.pause(Duration.ofSeconds(2));
	driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
	actions.pause(Duration.ofSeconds(2));
	driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Sharukh");
	actions.sendKeys(Keys.TAB).perform();
	driver.switchTo().activeElement().sendKeys("khan");
	actions.sendKeys(Keys.TAB).sendKeys("sharukh678@gmail.com").perform();
	actions.sendKeys(Keys.TAB).sendKeys("sharukh678@gmail.com").perform();
	actions.sendKeys(Keys.TAB).sendKeys("9854763268").perform();
	WebElement dayDropDown = driver.findElement(By.id("day"));
	dayDropDown.click();
	Select day=new Select(dayDropDown);
	day.selectByVisibleText("20");
	dayDropDown.click();
	WebElement monthDropDown = driver.findElement(By.id("month"));
	monthDropDown.click();
	Select month=new Select(monthDropDown);
	month.selectByVisibleText("Nov");
	monthDropDown.click();
	WebElement yearDropDown = driver.findElement(By.id("year"));
	yearDropDown.click();
	Select year=new Select(yearDropDown);
	year.selectByVisibleText("1997");
	yearDropDown.click();
	WebElement radioButton=driver.findElement(By.xpath("//input[@value='2' ]"));
	radioButton.click();
	driver.findElement(By.name("websubmit")).click();
	
}
}
