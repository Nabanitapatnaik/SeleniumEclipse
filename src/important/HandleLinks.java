package important;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Kindle")).click();
		
List<WebElement>	links = 	driver.findElements(By.tagName("a"));
System.out.println("The total number of links are :" +links.size());
	 for(WebElement linking:links)
		 
	 {
		String getit  =  linking.getText();
		System.out.println(getit) ;
	String att = 	 linking.getAttribute("href");
	System.out.println(att) ;
	
	
	
	 }
		
		
		
		
		
		
		
	}

}
