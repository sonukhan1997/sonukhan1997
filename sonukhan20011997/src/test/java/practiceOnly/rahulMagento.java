package practiceOnly;

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

public class rahulMagento {
	@Test
	public void RahulMagento() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://magento.softwaretestingboard.com/");
		Actions actions= new Actions(driver);
		driver.findElement(By.xpath("//header[@class='page-header']//li[@class='authorization-link']/a")).click();
        driver.findElement(By.id("email")).sendKeys("rahulpanday9504@gmail.com");
        driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Rahul@123");
        driver.findElement(By.xpath("//button[@class='action login primary']/span")).submit();
        WebElement searchoption = driver.findElement(By.id("search"));
        searchoption.click();
        searchoption.sendKeys("jacket");
        driver.findElement(By.xpath("//button[@title='Search']")).submit();
        actions.scrollByAmount(0,600 ).perform();
        WebElement jacket = driver.findElement(By.xpath("//img[@alt='Adrienne Trek Jacket']"));
        actions.moveToElement(jacket).perform();
        driver.findElement(By.xpath("//div[@class='swatch-opt-1316']//div[text()='S']")).click();
        driver.findElement(By.xpath("//div[@class='swatch-opt-1316']//div[@option-label='Orange']")).click();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
        actions.pause(2000).scrollByAmount(0, -600).perform();
        driver.findElement(By.xpath("//a[@class='action showcart']")).click();
        WebElement  qty =driver.findElement(By.xpath("//input[@type='number']"));
        actions.click(qty).sendKeys(Keys.ARROW_RIGHT).pause(2000).sendKeys(Keys.BACK_SPACE).pause(2000).sendKeys("2").build().perform();
        actions.click(driver.findElement(By.xpath("//span[text()='Update']"))).pause(2000).build().perform();
        driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
        driver.manage().window().minimize();
        driver.quit();
}
}