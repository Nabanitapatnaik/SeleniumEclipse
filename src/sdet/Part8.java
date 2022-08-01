package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part8 {

	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
/*Select Country = new Select(driver.findElement(By.id("input-country")));
	//Country.selectByValue("1");	
	//Country.selectByVisibleText("Antarctica");	
		Country.selectByIndex(2);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
