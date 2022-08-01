import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		/*driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement fileInput = driver.findElement(By.id("uploadfile_0"));
		fileInput.sendKeys("C:\\My workspace\\Practice docs\\Actions_11.docx");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		*/
		
		
        driver.get("https://imgbb.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Start uploading']")).click();
		StringSelection pic = new StringSelection("C:\\Users\\naban\\OneDrive\\Pictures\\Saved Pictures\\R.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pic, null);

Robot robot = new Robot();
robot.delay(500);

robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.delay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.delay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
System.out.println("ImageUploaded");











	}
	

}
