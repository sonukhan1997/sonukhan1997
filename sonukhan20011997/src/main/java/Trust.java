import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trust {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trust-ai-platform-dev.web.app/login");
		WebElement idtext = driver.findElement(By.xpath("//input[@formcontrolname='userEmail']"));
	    idtext.sendKeys("rahulraj.rr753@gmai.com");
	    WebElement pass = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
	    pass.sendKeys("rahulkumar");
	    driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

}
