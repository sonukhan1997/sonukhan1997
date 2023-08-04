package workstation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class lumaAssignment {
	@Test
	public void lumaAssignment() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("//header[@class='page-header']//li[@class='authorization-link']/a")).click();
        driver.findElement(By.id("email")).sendKeys("rahulpanday9504@gmail.com");
        driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Rahul@123");
        driver.findElement(By.xpath("//button[@class='action login primary']/span")).submit();
        WebElement searchoption = driver.findElement(By.id("search"));
        searchoption.click();
        searchoption.sendKeys("jacket");
        driver.findElement(By.xpath("//button[@title='Search']")).submit();
        WebElement jacket = driver.findElement(By.xpath("//img[@alt='Adrienne Trek Jacket']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");
        Actions actions= new Actions(driver);
        actions.moveToElement(jacket);
        //WebElement size = driver.findElement(By.xpath("//div[@class='product-item-info']//div[@class='swatch-option text selected']"));
       
	}

}
