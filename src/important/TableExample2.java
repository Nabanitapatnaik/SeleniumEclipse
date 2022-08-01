package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample2 {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.selenium.dev/ecosystem/");
driver.manage().window().maximize();
int row = driver.findElements(By.xpath("//table[@class='table']/tbody/tr")).size();
System.out.println("Total rows:"+row);
int col = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th")).size();
System.out.println("Total cols:"+col);

//String value = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[3]/td[2]")).getText();
//System.out.println("Value is:"+value);

for(int r=1; r<=row; r++)
{
	for(int c=1;c<=col;c++)
	{	
		String data = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+r+"]/td["+c+"]")).getText();
		System.out.println("Value is:"+data);

		
	}
	
	
	
}




	
}

		
		
		
		
		
		

	}


