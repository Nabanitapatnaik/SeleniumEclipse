import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
	
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("nabanita");
		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("patnaik");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("patnaiknabanita@gmail.com");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("9802451678");
	Select Country = new Select (driver.findElement(By.id("Form_submitForm_Country")));
	Country.selectByVisibleText("American Samoa");
	driver.findElement(By.xpath("//a[contains(text(),'Accept Cookies')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("Nocaptcha-Form_submitForm_Captcha")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	//driver.findElement(By.xpath("//button[@class='rc-button-default goog-inline-block']")).click();
	//driver.findElement(By.xpath("//input[@id='Form_submitForm_action_request']")).click();
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
