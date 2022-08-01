package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://demo.nopcommerce.com/");
		//isDisplayed()
	WebElement Search = driver.findElement(By.xpath("//button[@type='submit']"));
		
		System.out.println(	Search.isDisplayed());
		//isEnabled()
		System.out.println(	Search.isEnabled());
		/*isSelected() for radiobuttons and checkboxes*/
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement male = driver.findElement(By.id("gender-male"));
		System.out.println(male.isSelected());
		male.click();
		System.out.println(male.isSelected());
		
		
		
	}

}
