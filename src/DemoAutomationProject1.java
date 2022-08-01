import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoAutomationProject1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//driver.manage().window().maximize();
		//Thread .sleep(10000);
	//driver.findElement(By.name("firstname")).sendKeys("nabanita");
	//driver.findElement(By.name("lastname")).sendKeys("patnaik");
    //driver.findElement(By.xpath("//input[@id='sex-1']")).click();
    //driver.findElement(By.xpath("//input[@id='exp-6']")).click();
   // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05-26-2022");
   // driver.findElement(By.xpath("//input[@id='profession-1']")).click();
    //driver.findElement(By.xpath("//input[@id='tool-2']")).click();
	
    //Select Dropdown = new Select(driver.findElement(By.id("continents")));
    //Dropdown.selectByIndex(2);
	
    //Select Commands = new Select(driver.findElement(By.id("selenium_commands")));
    //Commands.selectByVisibleText("Switch Commands");
    
    //driver.findElement(By.xpath("//button[@id='submit']")).click();
	
		//driver.get("https://www.opencart.com/index.php?route=account/register");
		
		//driver.findElement(By.id("input-username")).sendKeys("Naba");
		//driver.findElement(By.id("input-firstname")).sendKeys("Nabanita");
		//driver.findElement(By.id("input-lastname")).sendKeys("Patnaik");
		//driver.findElement(By.id("input-email")).sendKeys("nabanitapatnaik@gmail.com");
		
		
		//driver.findElement(By.id("input-country"));
		//WebElement CountryElement = driver.findElement(By.id("input-country"));
		//Select CountryDropdown = new Select(driver.findElement(By.id("input-country")));
	
		//CountryDropdown.selectByVisibleText("Albania");
		//CountryDropdown.selectByValue("2");
		//CountryDropdown.selectByIndex(12);
		//driver.findElement(By.name("password")).sendKeys("Naban123678");
		//driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		
		
		
		
		
		
	
	}

}
