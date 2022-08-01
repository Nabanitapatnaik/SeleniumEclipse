import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadpractice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	  /*  driver.get("https://demo.guru99.com/test/upload/");
	    driver.manage().window().maximize();
	    WebElement fileInput = driver.findElement(By.id("uploadfile_0"));
	    fileInput.sendKeys("C:\\My workspace\\Practice docs\\drivers_class.docx");
	    driver.findElement(By.id("terms")).click();
	    driver.findElement(By.id("submitbutton")).click();
	*/
	
	driver.get("https://upload.photobox.com/en/#computer");
Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Get photos from your computer']")).click();
	StringSelection picture = new StringSelection("C:\\Users\\naban\\OneDrive\\Pictures\\Saved Pictures\\R.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(picture, null);
	Robot robot = new Robot();
	robot.delay(500);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.delay(500);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.delay(500);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("Image Uploaded   ");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
