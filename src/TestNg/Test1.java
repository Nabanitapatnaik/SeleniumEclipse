package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

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
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println("\"https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp\")");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

	}
	@Test
	public void test1()
	{
		Assert.fail();
	}




	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Successful");

	}
}





