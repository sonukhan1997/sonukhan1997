package handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FaceFileUploadPopup {
	@Test
public void FaceUploadFilePopup() throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/test/upload/");
	WebElement chooseFileButton = driver.findElement(By.id("uploadfile_0"));
	//chooseFileButton.click();
	//chooseFileButton.sendKeys(Keys.ENTER);
	Actions actions=new Actions(driver);
	String filePathToUpload="C:\\Users\\Public\\sonukhan20011997\\src\\test\\resources\\actionnotes.txt";
	StringSelection content = new StringSelection(filePathToUpload);
	Toolkit toolKit=Toolkit.getDefaultToolkit();
	Clipboard clipBoard=toolKit.getSystemClipboard();
	clipBoard.setContents(content, null);
	actions.moveToElement(chooseFileButton).click().perform();
	Thread.sleep(3000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	Thread.sleep(1000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(1200);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	driver.findElement(By.id("terms")).click();//checkBox
	driver.findElement(By.id("submitbutton")).click();//SubmitButton
	
	
}
}
