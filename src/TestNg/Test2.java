package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {


	WebDriver driver = null;

	@BeforeTest
	public void openbrowser()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test
	public void openurl() throws InterruptedException
	{
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println("\"https://www.mortgagecalculator.org/\")");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

	}
	



	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Successful");

	}
}


	
	
	
	
	
	
	

