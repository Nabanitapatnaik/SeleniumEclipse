package practiceexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextvsgetAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		WebElement finder = driver.findElement(By.id("Email"));
	//System.out.println(	finder.getText());
		System.out.println(finder.getAttribute("name"));
		
	WebElement text = 	driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		
		System.out.println(text.getText());
		
		
		
		

	}

}
