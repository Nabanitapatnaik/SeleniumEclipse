package important;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
      
        
     int row =   driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println(row);
		
		   int col =   driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
			System.out.println(col);
		
		String singleval = driver.findElement(By.xpath("//table[@id='customers']//tr[5]/td[1]")).getText();
		System.out.println(singleval);
			
			for(int r=1;r<=row;r++)
			{
			for(int c=1; c<=col;c++)
			{
				
				String data = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
				System.out.println(data);
				
				
			}
				
				
			}
			
		
		
		

	}

}
