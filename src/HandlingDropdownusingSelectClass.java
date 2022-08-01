import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownusingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/r.php");
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nab");
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pat");
		//driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("nab123456");
		//WebElement BirthdayDropdown = driver.findElement(By.id("month"));
	//Select Birthday = new Select(BirthdayDropdown);
		//Birthday.selectByIndex(11);
		
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
	
		driver.getTitle();
		System.out.println("driver.get(\"https://www.simplilearn.com/\")");
		driver.findElement(By.id("header_srch")).sendKeys("Selenium");
		driver.findElement(By.xpath("//button[@class='input-search-btn']")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[href='/automation-testing-masters-program-certification-training-course?tag=selenium']")).click();
		//driver.findElement(By.xpath("//div[@class='card-info']")).click();
		//driver.findElement(By.xpath("//h2[text()='Automation Testing Masters Program']")).click();
		//driver.navigate().to("https://www.novatesoft.io/");
		//driver.navigate().back();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
