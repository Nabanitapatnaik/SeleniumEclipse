package practiceexamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	String single = 	driver.getWindowHandle();
	System.out.println(single);//ID of single window
	driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	Set<String> multiple = driver.getWindowHandles();
	Iterator<String> it = multiple.iterator();
	String parent = it.next();
	String child = it.next();
	System.out.println(parent);
	System.out.println(child);
	driver.switchTo().window(parent);
	driver.quit();

	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
