import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertest {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//String demo = driver.getWindowHandle();
		//System.out.println(demo);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String> handle = driver.getWindowHandles();
		Iterator<String> ID = handle.iterator();
		String parent = ID.next();
		String child = ID.next();
		System .out.println(parent);
		System.out.println(child);

		driver.switchTo().window(parent);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.switchTo().window(child);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		driver.quit();
		
		
	}

}
