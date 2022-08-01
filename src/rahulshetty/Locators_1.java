package rahulshetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_1 {
	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=RajO_DEWV84hi8iCFFmylX79jZHujIMx9kGCBoNM3voP4fEvGNaw6OfEwWe1pJvjRL6UrAqSsfaSn-fv82Ogiw");
		driver.manage().window().maximize();
		
	
			String title = driver.getTitle();
			System.out.println("The title of the page is:"+title);
		String current = 	driver.getCurrentUrl();
		System.out.println("The current URL  of the page is:"+current);	
		Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("rahulshetty@gmail.com");
	driver.findElement(By.name("password")).sendKeys("xyz167892");
	driver.findElement(By.name("commit")).click();
//WebElement error = 	driver.findElement(By.xpath("//div[contains(text(),'Your email or password is incorrect.')]"));
//System.out.println(error.getText());

	WebElement message = driver.findElement(By.cssSelector("body.dsp-flex-xs.flex-direction-column.identity-layout:nth-child(2) main.p-v-5-m:nth-child(2) div.container.m-auto-xs.col-4-l.col-5-m.col-10-xs.p-h-6-l > div.bodySmall.m-b-3-xs.text-center-xs.auth-flash-error"));
	System.out.println(message.getText());
	//driver.findElement(By.linkText("Forgot Password")).click();
	driver.findElement(By.partialLinkText("Forgot")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
	}
		
		
		
		
		
		
		
		
		
		
		

	


