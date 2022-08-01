package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_RightClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo/input.html");
	WebElement button = 	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions act = new Actions(driver);	
	act.contextClick(button).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
