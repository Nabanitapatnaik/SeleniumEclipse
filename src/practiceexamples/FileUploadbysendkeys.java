package practiceexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadbysendkeys {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
	driver.findElement(By.id("file-upload")).sendKeys("C:\\My workspace\\Practice docs\\Actions_11.docx");
    //driver.findElement(By.id("pop_upload")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
