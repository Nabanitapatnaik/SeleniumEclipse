package practiceexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkandPartialLinkText {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//driver.findElement(By.linkText("Amazon Basics")).click(); //LinkText
		//driver.findElement(By.partialLinkText("Deals")).click();//Partial LinkText
		
		//How to capture all the links
		
		List<WebElement>list =  driver.findElements(By.tagName("a"));
		int size = list.size();
		System.out.println(size);
		for(WebElement all:list)
		{
			System.out.println(all.getText());
			System.out.println(all.getAttribute("href"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
