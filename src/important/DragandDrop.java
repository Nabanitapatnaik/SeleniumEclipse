package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      WebElement Stockholm = driver.findElement(By.id("box2"));
      WebElement US = driver.findElement(By.id("box103"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Stockholm, US).build().perform();
		
		
		

	}

}
