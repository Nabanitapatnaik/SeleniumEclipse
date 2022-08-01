package important;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowserwindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	//String web =  driver.getWindowHandle();
	//System.out.println(web);
	//String title = driver.getTitle();
	//System.out.println(title);
	 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String>	 handle =  driver.getWindowHandles();
Iterator<String> it = handle.iterator();
String parentid = it.next();
String childid = it.next();
System.out.println("Parent id is:" +parentid);
System.out.println("Child  id is:" +childid);		

driver.switchTo().window(parentid);
System.out.println("Parent id is:" +parentid);
String title = driver.getTitle();
System.out.println(title);	
driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
