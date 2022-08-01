package novatesoft;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RCCRegisterPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://ec2-44-230-141-105.us-west-2.compute.amazonaws.com/myportal/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		driver.findElement(By.linkText("click here")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("navkaur@gmail.com");
		driver.findElement(By.id("password")).sendKeys("nav1234456");
		driver.findElement(By.id("confirmPassword")).sendKeys("nav1234456");
		driver.findElement(By.id("inputFatherFName")).sendKeys("navdeep");
		driver.findElement(By.id("inputFatherMName")).sendKeys("kaur");
		driver.findElement(By.id("inputFatherLName")).sendKeys("singh");
		driver.findElement(By.id("parentDetailDto.primaryUserDetail.gender2")).click();
		driver.findElement(By.id("inputFatherPhone")).sendKeys("5184169870");
		Select branch = new Select(driver.findElement(By.id("branchId")));
		branch.selectByValue("1");
		driver.findElement(By.id("singleParentCheckBox")).click();
		Select source = new Select(driver.findElement(By.xpath("//select[@id = 'channelCode']")));
		source.selectByVisibleText("Facebook");
		

		/*
		 * driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		 * Thread.sleep(200);
		 * driver.findElement(By.xpath("//input[@id='autocomplete']")).
		 * sendKeys("3231 Johnny Cake Lane, Charlotte, NC, USA"); Thread.sleep(200);
		 * driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.
		 * ARROW_DOWN); Thread.sleep(200);
		 * driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.
		 * ENTER);
		 */
		/*driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		WebElement searchbox = driver.findElement(By.id("autocomplete"));
		searchbox.sendKeys("3131");
		String txt;
		do {
			searchbox.sendKeys(Keys.ARROW_DOWN);
			txt = searchbox.getAttribute("value");
			if (txt.equalsIgnoreCase("3131 Cloverfield Road, Charlotte, NC, USA")) {
				searchbox.sendKeys(Keys.ENTER);
			}

		} while (!txt.isEmpty());*/
	}

}
