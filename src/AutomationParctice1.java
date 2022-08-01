import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.internal.Console;

public class AutomationParctice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//driver.getTitle();
	//	System.out.println(driver.getTitle());
		//driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(3000);
	/*-----------------------------------------------------------------------------------	
		/*String Expected_Result = "Create an account";
		String Actual_Result = driver.findElement(By.xpath("//h3[text()='Create an account']")).getText();
		if(Actual_Result.equalsIgnoreCase(Expected_Result))
		{
		System.out.println("The TC is passed");
		}
		else
		{
			System.out.println("The TC is failed");
		}
		}*/
	
		/*driver.findElement(By.id("email_create")).sendKeys("nabanitapatnaik@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("customer_firstname")).sendKeys("Nabanita");
		driver.findElement(By.id("customer_lastname")).sendKeys("Patnaik");
		driver.findElement(By.id("passwd")).sendKeys("Patnaik123");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='years']")));
	year.selectByVisibleText("2022  ");
	Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
	month.selectByVisibleText("January ");
	Select date = new Select(driver.findElement(By.xpath("//select[@id='days']")));
	date.selectByValue("1");
	driver.findElement(By.id("newsletter")).click();
	driver.findElement(By.id("firstname")).sendKeys("NABANITA");
	driver.findElement(By.id("lastname")).sendKeys("PATNAIK");
	driver.findElement(By.id("company")).sendKeys("NOVATESOFT");
	driver.findElement(By.id("address1")).sendKeys("Arboretum,28226");
	driver.findElement(By.id("city")).sendKeys("Charlotte");	
    Select State = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
    State.selectByValue("33");
    driver.findElement(By.id("postcode")).sendKeys("28226");
    Select Country = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
    Country.selectByValue("21");
    driver.findElement(By.id("phone_mobile")).sendKeys("5183218162");
    driver.findElement(By.id("alias")).sendKeys("Concord , NC");
    driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
    */
		
		/*driver.findElement(By.id("email")).sendKeys("nabanitapatnaik@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Patnaik123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		*/
		
	/*	String Expected_Result = "Nabanita Patnaik";
		String Actual_Result = driver.findElement(By.linkText("Nabanita Patnaik")).getText();
				if(Actual_Result.equalsIgnoreCase(Expected_Result)) 
				{
		System.out.println("Validation Passed");
				}
				else
					System.out.println("Validation Failed");
		*/
		
		/*String Expected_Result = "MyAccount";
		String Actual_Result = driver.findElement(By.xpath("//h1[text()='My account']")).getText();
				if(Actual_Result.equalsIgnoreCase(Expected_Result)) 
				{
		System.out.println("Validation Passed");
				}
				else
					System.out.println("Validation Failed");
		*/
		
		/*driver.findElement(By.id("email")).sendKeys("naba");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Patnaik123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
	String Expected_Result="Invalid email address.";
	String Actual_Result=driver.findElement(By.xpath("//div[@class='alert alert-danger'][1]")).getText();
	
	if(Actual_Result.contains(Expected_Result))
	{
System.out.println("Validation Passed");
	}
	else
		System.out.println("Validation Failed"); */
		
	/*	driver.findElement(By.id("email_create")).sendKeys("hinabanita@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
	String Expected_Result="There are 8 errors";
    String Actual_Result=(driver.findElement(By.xpath("//div[@class='alert alert-danger']"))).getText();
   
    if(Actual_Result.contains(Expected_Result)) 
    {
    	System.out.println("Validation Passed");
    		}
    		else
    			System.out.println("Validation Failed");*/
		
		driver.findElement(By.id("email")).sendKeys("nabanitapatnaik@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Patnaik123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		

		Thread.sleep(4000);
 
  Actions act = new Actions(driver);
 WebElement Women = driver.findElement(By.xpath("//a[text()='Women']"));
 act.moveToElement(Women).build().perform();
 driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		
	/*	
		Actions act = new Actions(driver);
		WebElement Women =  driver.findElement(By.xpath("//a[text()='Women']"));
		act.moveToElement(Women).build().perform();
		driver.findElement(By.xpath("//a[text()='Blouses']")).click();
	*/
	
	String Shirt = driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
	System.out.println("Type is:"+Shirt);
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Faded Short Sleeve T-shirts");
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();	
	
	String Expected_Result= "FADED SHORT SLEEVE T-SHIRTS";
String Actual_Result=driver.findElement(By.xpath("//h1[@class='page-heading  product-listing']")).getText();
	
	if(Actual_Result.contains(Expected_Result)) {
	

    	System.out.println("Validation Passed");
	
	
	}
	else

    	System.out.println("Validation Passed");
		
		
	}	

	}


