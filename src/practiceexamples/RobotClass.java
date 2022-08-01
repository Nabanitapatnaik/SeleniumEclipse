package practiceexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {
	
	public static void main(String[] args) throws AWTException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://upload.photobox.com/en/#computer");
	driver.findElement(By.xpath("//button[@id='button_desktop']")).click();
	StringSelection ss = new StringSelection("C:\\Users\\naban\\OneDrive\\Pictures\\Saved Pictures\\R.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


