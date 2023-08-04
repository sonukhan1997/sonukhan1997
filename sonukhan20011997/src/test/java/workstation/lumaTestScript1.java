 package workstation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class lumaTestScript1 {
	@Test
public void lumaPractice() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("http://magento.softwaretestingboard.com/");
    driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
    driver.findElement(By.id("email")).sendKeys("khanshoukatali6@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("Powerstar@1997");
    driver.findElement(By.xpath("//button[@class='action login primary']/span")).submit();
    WebElement searchTextField = driver.findElement(By.id("search"));
    searchTextField.sendKeys("jacket");
    driver.findElement(By.xpath("//button[@title='Search']")).submit();
   WebElement firstJacket = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[1]"));
   Actions actions=new Actions(driver);
   //actions.moveToElement(firstJacket).pause(2000).moveByOffset(245, 0).pause(3000).moveByOffset(245, 0);
   actions.moveToElement(firstJacket).perform();
   driver.findElement(By.xpath("(//div[@class='swatch-option text'])[2]")).click();
   driver.findElement(By.id("option-label-color-93-item-56")).click();
   driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
   actions.scrollByAmount(0, -600).release().perform();
   driver.findElement(By.xpath("//a[@class='action showcart']")).click();
   WebElement qtyInput = driver.findElement(By.xpath("//input[@data-cart-item-id='WJ08-S-Orange']"));
   actions.click(qtyInput).sendKeys(Keys.ARROW_RIGHT).sendKeys("2").build().perform();
   
   
   
   
    
    
}
}
