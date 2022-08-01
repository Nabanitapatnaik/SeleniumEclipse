import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.123formbuilder.com/free-form-templates/gallery-registration/#.");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		

		//WebElement solutions=driver.findElement(By.linkText("Solutions"));
		//Actions action=new Actions(driver);
		//action.moveToElement(solutions).perform();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Customer Feedback")).click();

	//WebElement Int=driver.findElement(By.linkText("Integrations"));
	//Actions act=new Actions(driver);
	//act.contextClick(Int).build().perform(); //Right click action
	//Thread.sleep(3000);;
	//driver.findElement(By.linkText("Salesforce")).click();
	
		//WebElement Temp = driver.findElement(By.linkText("Templates"));
		//Actions actt = new Actions(driver);
		//actt.moveToElement(Temp).build().perform();
		//driver.findElement(By.linkText("Membership forms")).click();
		
		/*WebElement Ent=driver.findElement(By.linkText("Enterprise"));
		Actions act =new Actions(driver);
		act.moveToElement(Ent).build().perform();
		driver.findElement(By.linkText("Human Resources")).click();
		driver.findElement(By.linkText("REQUEST MEETING")).click();
		*/
		

		
	/*	Actions act = new Actions(driver);
	WebElement Sol = driver.findElement(By.linkText("Solutions"));
	act.moveToElement(Sol).build().perform();
	driver.findElement(By.linkText("Quiz Maker")).click();
		*/
		
	WebElement Int = driver.findElement(By.linkText("Templates"));
	Actions act  = new Actions(driver);
	act.moveToElement(Int).build().perform();
	driver.findElement(By.linkText("Donation forms")).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
