import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwaitexample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//h3[text()='SELENIUM: Overview, Uses, Side Effects ... - WebMD']")).click();
        
		
		
		
		
		
		
		
		
		

	}

}
