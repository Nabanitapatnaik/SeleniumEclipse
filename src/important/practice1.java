package important;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	driver.manage().window().maximize();
	System.out.println("The title of the page is:"+driver.getTitle());
	System.out.println(driver.getCurrentUrl());	
	driver.findElement(By.name("firstname")).sendKeys("ritu");
	driver.findElement(By.name("lastname")).sendKeys("ray");	
	driver.findElement(By.xpath("//input[@value='Female']")).click();	
	driver.findElement(By.xpath("//input[@value='4']"))	.click();
	driver.findElement(By.id("datepicker"))	.sendKeys("11/10/2022");
	driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
	driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();	
		Select cont = new Select(driver.findElement(By.id("continents")));
		cont.selectByVisibleText("Africa");
		Select com = new Select(driver.findElement(By.id("selenium_commands")));
		com.selectByVisibleText("Switch Commands");
driver.findElement(By.id("photo")).click();
driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\naban\\OneDrive\\Pictures\\Saved Pictures\\R.jpg");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
