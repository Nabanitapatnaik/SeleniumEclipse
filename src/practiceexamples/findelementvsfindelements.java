package practiceexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelementvsfindelements {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			//driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
			Thread.sleep(5000);
			
			//findelement:
	
	//WebElement search = driver.findElement(By.id("small-searchterms"));
	//search.sendKeys("computer");
	//WebElement foot = driver.findElement(By.xpath("//div[@class='footer']//a"));
//String Text = foot.getText();
//System.out.println(Text);
//System.out.println("Total items = "+foot.getSize());
	
	//findElements
/*List<WebElement> Total = driver.findElements(By.xpath("//div[@class='footer']//a"));
System.out.println(Total.size());
for(WebElement tot:Total) {
	
	String All =tot.getText();
	System.out.println(All);
	*/
	}

			
	
		
			
			
			
			
			
			
			
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

