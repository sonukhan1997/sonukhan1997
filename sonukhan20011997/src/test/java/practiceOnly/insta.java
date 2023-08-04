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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class insta {
	@Test(dataProvider = "loginTestData")
public  void insta(String username,String password) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
		driver.get("https://www.instagram.com/");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.click();
		usernameTextField.sendKeys(username);
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.click();
		passwordTextField.sendKeys(password);
		WebElement showButton = driver.findElement(By.xpath("//button[text()='Show']"));
		showButton.click();
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		loginButton.click();
		WebElement notNowButton = driver.findElement(By.xpath("//button[text()='Not Now']"));
		notNowButton.click();
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		driver.switchTo().activeElement().sendKeys("mr.blackhat5394");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='none']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Message']")).click();
		Thread.sleep(3000);
		WebElement msgtextfield = driver.findElement(By.xpath("//textarea[@placeholder='Message...']"));
	   for (int i = 1; i < 51; i++) {
		   
		   msgtextfield.sendKeys(""+i+". Wish You A Very woderful Birthday");
		    actions.sendKeys(Keys.ENTER).perform();
		
	}
	    driver.findElement(By.xpath("//div[text()='More']")).click();
        driver.findElement(By.xpath("//div[text()='Log out']")).click();
        driver.manage().window().minimize();
        driver.quit();
}
	@DataProvider(name = "loginTestData")
	public Object[][] loginData() {
		Object[][]data=new Object[2][2];
		data[0][0]="9449060109";
		data[0][1]="Powerstar@1997";
//		data[1][0]="9482243030";
//		data[1][1]="sandeshnaik1996";
		return data;
		
	}
}
