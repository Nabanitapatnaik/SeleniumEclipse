package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveto {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naban\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_398f77c9-e6f5-47da-b0ac-e7644d341f5b_2_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_2.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
		driver.manage().window().maximize();
		
		
	WebElement W = 	driver.findElement(By.xpath("//span[text()='Women']"));
	Actions act = new Actions(driver);
	act.moveToElement(W).build().perform();
	driver.findElement(By.xpath("//a[@title='Blouse']")).click();
	
		
		
		
		
		
		

	}

}
