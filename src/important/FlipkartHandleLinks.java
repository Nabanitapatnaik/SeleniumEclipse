package important;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartHandleLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		List<WebElement> lin = driver.findElements(By.tagName("a"));
		System.out.println("Total:" + lin.size());
		for(WebElement link:lin)
		{
		
	String Text = 	link.getText();
	System.out.println(Text);
String at = 	link.getAttribute("href");
System.out.println(at);
		
		}
		
		
		
	}

}
