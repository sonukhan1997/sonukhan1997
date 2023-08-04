package handlingpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptPopup {
	@Test
public void PromptPopup() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:Users/HP/DesktopOffice/Sample%20WebPages/popups/prompt.html");
	//Handle the prompt popup
	String assertiveStatement = driver.switchTo().alert().getText();
	System.out.println("assertiveStatement :"+assertiveStatement);
	driver.switchTo().alert().sendKeys("18");
	driver.switchTo().alert().accept();
	
}
}
