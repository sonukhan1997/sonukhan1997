package practiceOnly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Facebook {
	@Test
	
	public void fb() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9449060109");
		driver.findElement(By.id("pass")).sendKeys("Powerstar@1997");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(3)).sendKeys("bhavya poojari").pause(Duration.ofSeconds(4)).sendKeys(Keys.ARROW_DOWN).build().perform();
//		WebElement SearchTextField = driver.findElement(By.xpath("//div[@class='xh8yej3']/div/label/input"));
//		SearchTextField.sendKeys("bhavya poojari");
//		SearchTextField.sendKeys(Keys.ENTER);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		WebElement messageButton = driver.findElement(By.xpath("//div[@class=' xh8yej3']/div/div/div/div/img[@class='x1b0d499 xaj1gnb']"));
		messageButton.click();
		WebElement msgTxtFld = driver.findElement(By.xpath("//div[@class='x78zum5 x1a02dak x13a6bvl']/div/div/p"));
		for (int i = 0; i <11; i++) {
			msgTxtFld.sendKeys("No."+i+". Hi...Wish u a wonderful birthday..stay blissful");
			actions.sendKeys(Keys.ENTER).perform();
			
		}
		
		driver.manage().window().minimize();
		driver.quit();
	}
	

}
