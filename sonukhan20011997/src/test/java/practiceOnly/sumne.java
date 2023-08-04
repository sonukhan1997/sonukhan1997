package practiceOnly;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class sumne {
	@Test
public void Summane() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facecook.com.");
	String time = LocalDateTime.now().toString();
	System.out.println("time :"+time );
	LocalDateTime tm = LocalDateTime.now();
	System.out.println(tm);
	LocalDateTime tyuy = LocalDateTime.now().plusMinutes(0);
	System.out.println(tyuy);
}
}
