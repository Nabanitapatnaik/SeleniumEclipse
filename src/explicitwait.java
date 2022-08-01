import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      driver.findElement(By.name("q")).sendKeys("selenium");
      driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
 WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='SELENIUM: Overview, Uses, Side Effects ... - WebMD']")));
        element.click();
		
		
		
		
		
		
		
	}

}
