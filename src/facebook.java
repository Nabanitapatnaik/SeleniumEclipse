import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Rose");
		driver.findElement(By.name("lastname")).sendKeys("margaret");
		driver.findElement(By.name("reg_email__")).sendKeys("margaretrose@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("margaretrose123");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		
		Select day = new Select(driver.findElement(By.id("day")));
        day.selectByValue("9");
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("2009");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
     String   Expected_Result = "Create a new account";
     String   Actual_Result = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
        System.out.println(Actual_Result);
       if(Actual_Result.contains(Expected_Result))
       {
        System.out.println("Successful");
       }
       else
       {
        
    	   System.out.println("Unsuccessful");
       }
		
		

	}

}
