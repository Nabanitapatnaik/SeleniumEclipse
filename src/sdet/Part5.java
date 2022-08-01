package sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//navigate to
		//driver.navigate().to("https://www.javatpoint.com/testng-tutorial");
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.get("https://www.javatpoint.com/testng-tutorial");
		//navigate back
		
		driver.navigate().back();
		
		//navigate forward
		driver.navigate().forward();
		driver.navigate().refresh();//reload thepage
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
