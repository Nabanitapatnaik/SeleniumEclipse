package sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part9 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("(//a[@class='btn-primary dropdown-toggle btn-block'])[1]")).click();
		List<WebElement> Products = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println(Products.size());
		for(WebElement lists:Products)
		{
			if(lists.getText().equalsIgnoreCase("Cards"))
			{
				lists.click();
				break;
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
