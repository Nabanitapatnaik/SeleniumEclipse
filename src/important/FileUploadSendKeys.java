package important;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadSendKeys {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://pasteboard.co/");
		//driver.findElement(By.xpath("//label[@class='file-upload-label button confirm']")).click();
		/*driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\naban\\OneDrive\\Desktop\\Certifications\\R.jpg");
		driver.findElement(By.xpath("//span[text()='Upload']")).click();
		*/
		
	driver.get("https://imgbb.com/");
	driver.findElement(By.xpath("//a[@class='btn btn-big blue']")).click();
	StringSelection pic = new StringSelection("C:\\Users\\naban\\OneDrive\\Desktop\\Certifications\\R.jpg");	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pic,null);
	Robot robot = new Robot();
	robot.delay(500);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.delay(500);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
		
	}

}
