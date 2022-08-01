package practiceexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).clear();
		WebElement city = driver.findElement(By.id("autocomplete"));
		city.sendKeys("Bel");
		String txt;
		do {
			city.sendKeys(Keys.ARROW_DOWN);
		txt = 	city.getAttribute("value");
		if(txt.equalsIgnoreCase("Belgium"))
			
		{
			
			city.sendKeys(Keys.ENTER);
			
		}
			
			
			
			
			
		}while(!txt.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
