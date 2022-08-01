package novatesoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practicetest1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://ec2-44-230-141-105.us-west-2.compute.amazonaws.com/myportal/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("j_username")).sendKeys("devang@yopmail.com");
		driver.findElement(By.id("j_password")).sendKeys("P@ssw0rd");
		driver.findElement(By.id("loginbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[@class='panel-title']")).click();
		driver.findElement(By.xpath("//a[@class='ng-binding ng-scope']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='btnQuestionCategorize'])[1])")).click();
				
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btnQuestionCategorize'])[2]")).click();
				
		driver.findElement(By.linkText("Operations with Integers")).click();

	}

}
