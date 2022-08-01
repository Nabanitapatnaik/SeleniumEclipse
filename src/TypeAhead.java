import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeAhead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("MINT");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN,Keys.ENTER);
		
		
		
}
}